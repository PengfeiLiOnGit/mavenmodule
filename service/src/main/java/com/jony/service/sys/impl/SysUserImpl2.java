package com.jony.service.sys.impl;

import com.jony.dao.sys.entity.SysUser;
import com.jony.dao.sys.mapper.SysUserMapper;
import com.jony.service.sys.ISysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("s2")
public class SysUserImpl2 implements ISysUser {
    @Autowired
    protected SysUserMapper mapper;

    @Override
    public List<SysUser> selectAll() {
        System.out.println("this is 2");
        return mapper.selectAll();
    }
}
