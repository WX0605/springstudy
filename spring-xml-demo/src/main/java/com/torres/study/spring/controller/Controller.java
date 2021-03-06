package com.torres.study.spring.controller;


import com.torres.study.spring.aop.MyLog;
import com.torres.study.spring.services.IHelloMessage;

public class Controller {
    private IHelloMessage helloMessage;

    public IHelloMessage getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(IHelloMessage helloMessage) {
        this.helloMessage = helloMessage;
    }
    @MyLog
    public String sayHello(){
         return helloMessage.sayHello();
    }
}
