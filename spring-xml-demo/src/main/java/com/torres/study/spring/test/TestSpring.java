package com.torres.study.spring.test;


import com.torres.study.spring.controller.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/bean.xml");
        Controller controller =(Controller) ctx.getBean("controller");
        System.out.println("===controller.sayHello()==="+controller.sayHello());

    }
}

