package com.lionet.domain;

import java.util.Date;

/**
 * @author Lionet
 * @date 2018/12/20 18:39
 */
public class User {
    private Integer id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;
    private String A;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", A='" + A + '\'' +
                '}';
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
