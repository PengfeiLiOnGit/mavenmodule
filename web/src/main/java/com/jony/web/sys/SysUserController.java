package com.jony.web.sys;

import com.jony.dao.sys.entity.SysUser;
import com.jony.service.sys.ISysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SysUserController {
    @Autowired
    private ISysUser sysUser;

    @RequestMapping({"/index"})
    public String index(){
        List<SysUser> users = sysUser.selectAll();
        System.out.println("hello");
        return "index";
    }

    @RequestMapping({"/"})
    public String ii(){
        return "tt";
    }
}
