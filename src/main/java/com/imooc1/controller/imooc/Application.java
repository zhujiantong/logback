package com.imooc1.controller.imooc;

import com.imooc1.controller.imooc.entity.MyDataSource;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


 @Bean
 @ConfigurationProperties(prefix = "db")
 public MyDataSource dataSource(){
	return new MyDataSource();
 }

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).bannerMode(Banner.Mode.OFF).build().run(args);
	}
}
