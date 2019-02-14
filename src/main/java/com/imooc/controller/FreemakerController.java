package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemakerController {

    @RequestMapping("freemaker")
    public String freemaker(Model model){
        int i = 1/0;
        model.addAttribute("msg","hello FreeMaker");
        return "hello";
    }
}
