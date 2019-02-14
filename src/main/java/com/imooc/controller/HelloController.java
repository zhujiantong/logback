package com.imooc.controller;


import com.imooc.entity.MyDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private MyDataSource myDataSource;

   /* @Value("${springboot.randomlong}")
    private int randomInt;*/

   @RequestMapping("/hello")
    public Object hello(){
       try {
           System.out.println(myDataSource.toString());

       }catch (Exception e){
           logger.info("aa->{}",e);
       }finally {
           if(logger.isInfoEnabled()) {
               logger.info("aa->{}", "哈哈哈");
           }
           return "hello springboot1";
       }

    }
}
