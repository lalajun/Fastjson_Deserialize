package com.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Main {

    public static void main(String[] args) {
        //创建一个用于实验的user类
        User user1 = new User();
        user1.setName("lala");
        user1.setAge(11);

        //序列化
//        String serializedStr = JSON.toJSONString(user1);
//        System.out.println("serializedStr="+serializedStr);
//
//        //通过parse方法进行反序列化，返回的是一个JSONObject
//        Object obj1 = JSON.parse(serializedStr);
//        System.out.println("parse反序列化对象名称:"+obj1.getClass().getName());
//        System.out.println("parse反序列化："+obj1);
//
//        //通过parseObject,不指定类，返回的是一个JSONObject
//        Object obj2 = JSON.parseObject(serializedStr);
//        System.out.println("parseObject反序列化对象名称:"+obj2.getClass().getName());
//        System.out.println("parseObject反序列化:"+obj2);
//
//        //通过parseObject,指定类后返回的是一个相应的类对象
//        Object obj3 = JSON.parseObject(serializedStr,User.class);
//        System.out.println("parseObject反序列化对象名称:"+obj3.getClass().getName());
//        System.out.println("parseObject反序列化:"+obj3);

    //@type序列化
        String serializedStr1 = JSON.toJSONString(user1,SerializerFeature.WriteClassName);
        System.out.println("serializedStr1="+serializedStr1);

    //通过parse方法进行反序列化
        Object obj4 = JSON.parse(serializedStr1);
        System.out.println("parse反序列化对象名称:"+obj4.getClass().getName());
        System.out.println("parseObject反序列化:"+obj4);

    //通过这种方式返回的是一个相应的类对象
        Object obj5 = JSON.parseObject(serializedStr1);
        System.out.println("parseObject反序列化对象名称:"+obj5.getClass().getName());
        System.out.println("parseObject反序列化:"+obj5);

    }
}