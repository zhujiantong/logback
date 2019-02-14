package com.imooc.controller;

import com.imooc.entity.User;
import com.imooc.entity.UserCustom;
import com.imooc.entity.UserQueryVo;
import com.imooc.mybatis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("mybatis")
    @ResponseBody
    public List<User> selectAllUser() throws Exception{
        UserQueryVo userQueryVo = new UserQueryVo();
        UserCustom userCustom = new UserCustom();
        userCustom.setUsername("小明");
        userCustom.setSex("1");
        userQueryVo.setUserCustom(userCustom);

        //id集合
        List<Integer> ids  = new ArrayList<Integer>();
        ids.add(16);
        ids.add(22);
        userQueryVo.setIds(ids);
        return userMapper.findUserList(userQueryVo);
    }
}
