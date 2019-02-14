package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;

@Controller
public class DataSourceController {

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @RequestMapping("ds")
    @ResponseBody
    public String datasource() throws Exception{
       Connection connection = dataSource.getConnection();
        return dataSource.getClass()+"-"+dataSource.toString();
    }



}
