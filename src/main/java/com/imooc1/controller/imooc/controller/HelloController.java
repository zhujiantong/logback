package com.imooc1.controller.imooc.controller;


import com.imooc1.controller.imooc.entity.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private MyDataSource myDataSource;

   /* @Value("${springboot.randomlong}")
    private int randomInt;*/

   @RequestMapping("/hello")
    public Object hello(){
       System.out.println(myDataSource.toString());
        return "hello springboot1";
    }
}
