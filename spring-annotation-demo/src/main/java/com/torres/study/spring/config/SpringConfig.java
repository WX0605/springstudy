package com.torres.study.spring.config;

import com.torres.study.spring.bean.ManBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.torres.study.spring.bean")
public class SpringConfig {

    @Bean
    public ManBean dotaBean() {
        return new ManBean();
    }

}
