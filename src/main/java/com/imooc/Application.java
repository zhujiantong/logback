package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;


@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mybatis")
@ImportResource(locations = "classpath:application-tx.xml")
/*@EnableTransactionManagement*/
public class Application {

	/**
	 * 代码的方式实现dataSource
	 */

	/*@Bean
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setInitialSize(3);
		return dataSource;
	}*/
	/*@Bean
	@ConfigurationProperties(prefix = "ds")
	public DataSource dataSource(Properties properties) throws Exception {
		return DruidDataSourceFactory.createDataSource(properties);
	}*/

	@Bean(name = "txManager")
	public PlatformTransactionManager txManager(@Qualifier("dataSource") DataSource dataSource) throws Exception {
		return new DataSourceTransactionManager(dataSource);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).bannerMode(Banner.Mode.OFF).build().run(args);
	}
}
