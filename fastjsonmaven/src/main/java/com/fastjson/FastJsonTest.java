package com.fastjson;
import com.alibaba.fastjson.JSON;

import java.io.IOException;

public class FastJsonTest {

    public String name;
    public String age;
    public FastJsonTest() throws IOException {
    }

    public void setName(String test) {
        System.out.println("name setter called");
        this.name = test;
    }

    public String getName() {
        System.out.println("name getter called");
        return this.name;
    }

    public String setAge(String test) {
        System.out.println("Age setter called");
        this.name = test;
        return this.age;
    }

    public String getAge(){
        System.out.println("age getter called");
        return this.age;
    }

    public static void main(String[] args) {
        Object obj = JSON.parse("{\"@type\":\"com.fastjson.FastJsonTest\",\"name\":\"thisisname\", \"age\":\"thisisage\"}");
        System.out.println(obj);

        Object obj2 = JSON.parseObject("{\"@type\":\"com.fastjson.FastJsonTest\",\"name\":\"thisisname\", \"age\":\"thisisage\"}");
        System.out.println(obj2);

        Object obj3 = JSON.parseObject("{\"@type\":\"com.fastjson.FastJsonTest\",\"name\":\"thisisname\", \"age\":\"thisisage\"}",FastJsonTest.class);
        System.out.println(obj3);
    }

}
