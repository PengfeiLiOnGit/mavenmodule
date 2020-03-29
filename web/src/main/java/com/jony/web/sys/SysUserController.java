package com.jony.web.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SysUserController {

    @RequestMapping({"","/index"})
    public String index(){
        System.out.println("hello");
        return "index";
    }
}
