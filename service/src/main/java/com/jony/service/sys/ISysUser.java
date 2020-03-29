package com.jony.service.sys;

import com.jony.dao.sys.entity.SysUser;

import java.util.List;

public interface ISysUser {
    List<SysUser> selectAll();
}
