package com.jony.dao.sys.mapper;

import com.jony.dao.sys.entity.SysUser;

import java.util.List;

/**
 * mapper 文件
 */
public interface SysUserMapper {
    //    查询所有用户信息
    List<SysUser> selectAll();
}
