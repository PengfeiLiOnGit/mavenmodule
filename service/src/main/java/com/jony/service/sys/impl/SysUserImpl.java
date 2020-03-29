package com.jony.service.sys.impl;

import com.jony.dao.sys.entity.SysUser;
import com.jony.dao.sys.mapper.SysUserMapper;
import com.jony.service.sys.ISysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserImpl implements ISysUser {

    @Autowired
    protected SysUserMapper mapper;

    public List<SysUser> selectAll() {
        return mapper.selectAll();
    }
}
