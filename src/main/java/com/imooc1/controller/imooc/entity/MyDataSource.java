package com.imooc1.controller.imooc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
public class MyDataSource {

    private String username;

    private String password;

    private String url;

}
