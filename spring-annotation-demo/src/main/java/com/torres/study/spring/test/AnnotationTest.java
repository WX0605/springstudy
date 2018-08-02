package com.torres.study.spring.test;

import com.torres.study.spring.bean.ManBean;
import com.torres.study.spring.bean.StudentBean;
import com.torres.study.spring.bean.TeacherBean;
import com.torres.study.spring.bean.WomenBean;
import com.torres.study.spring.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class,StudentBean.class,TeacherBean.class);

        System.out.println(context.getBean(SpringConfig.class));
        System.out.println( context.getBean(StudentBean.class));
        System.out.println( context.getBean(TeacherBean.class));


        System.out.println( context.getBean(ManBean.class));
        System.out.println( context.getBean(WomenBean.class));
    }
}
