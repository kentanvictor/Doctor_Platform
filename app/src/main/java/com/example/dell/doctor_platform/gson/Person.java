package com.example.dell.doctor_platform.gson;

/*
 * Created by kentan on 2017/7/5.
 */

import cn.bmob.v3.BmobObject;

public class Person extends BmobObject {
    private String name;
    private String address;
    private String phoneNumber;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
