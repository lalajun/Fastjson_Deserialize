package com.fastjson;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Properties;

public class Person {
    public String name;
    private String full_name;
//    public Boolean isOk;
    private int age;
    private Boolean sex;
    private Properties prop;

    public Person(){
        System.out.println("Person构造函数");
    }

    public void isOk(boolean ok){
        System.out.println("isok()");
//        this.isOk = ok;
    }

//    public void setOk(boolean ok){
//        System.out.println("setok()");
//        this.isOk = ok;
//    }

    public void setAge(int age){
        System.out.println("setAge()");
        this.age = age;
    }

    public Boolean getSex(){
        System.out.println("getSex()");
        return this.sex;
    }
    public Properties getProp(){
        System.out.println("getProp()");
        return this.prop;
    }

    public String toString() {
        String s = "[Person Object] name=" + this.name +  " full_name=" + this.full_name + ", age=" + this.age + ", prop=" + this.prop + ", sex=" + this.sex;
        return s;
    }
}