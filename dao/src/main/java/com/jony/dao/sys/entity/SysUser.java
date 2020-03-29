package com.jony.dao.sys.entity;

import java.io.Serializable;

public class SysUser implements Serializable {

    private static final long serialVersionUID = 3550506652604549938L;

    private String id;
    private String userName;
    private String userRealName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

}
