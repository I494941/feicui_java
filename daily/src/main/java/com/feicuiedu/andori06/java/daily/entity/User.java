package com.feicuiedu.andori06.java.daily.entity;

import java.math.BigInteger;
import java.sql.Date;

/**
 * Created by chenyan on 2016/10/17.
 */
public class User {

    // user主键
    private BigInteger id;

    // 姓名
    private String name;

    // 登录名称
    private String loginName;

    // 性别 0：女 1：男
    private String sex;

    // 出生日期
    private Date birthday;

    // 密码
    private String password;

    // 个人描述
    private String description;

    public User() {

    }

    public User(String loginName,
                String password) {
        this.loginName = loginName;
        this.password = password;
    }

    public User(String name,
                String loginName,
                String sex,
                Date birthday,
                String password,
                String description) {
        this.name = name;
        this.loginName = loginName;
        this.sex = sex;
        this.birthday = birthday;
        this.password = password;
        this.description = description;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

}
