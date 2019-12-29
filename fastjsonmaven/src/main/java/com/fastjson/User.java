package com.fastjson;

public class User {
    private String name;
    private int age;
    public byte[] bit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setbytes(byte[] bytes) {
        this.bit = bytes;
    }
    public byte[] getbytes() {
        return bit;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}