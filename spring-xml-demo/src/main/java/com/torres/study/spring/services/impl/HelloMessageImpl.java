package com.torres.study.spring.services.impl;


import com.torres.study.spring.services.IHelloMessage;

public class HelloMessageImpl implements IHelloMessage {
    @Override
    public String sayHello() {
        System.out.println("===message===");
        return  "hello!";
    }
}
