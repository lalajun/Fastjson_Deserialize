package com.fastjson;

import com.alibaba.fastjson.JSON;

public class type {

    public static void main(String[] args) {
        String eneity3 = "{\"@type\":\"com.fastjson.Person\", \"name\":\"lala\", \"isOk\":1 , \"full_name\":\"lalalolo\",\"age\": 13, \"prop\": {\"123\":123}, \"sex\": 1}";
        Object obj = JSON.parseObject(eneity3,Person.class);
        System.out.println(obj);
    }
}
