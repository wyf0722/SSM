package com.fan;

import com.fan.config.SpringConfig;
import com.fan.service.impl.BookServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookServiceImpl bean = ctx.getBean(BookServiceImpl.class);
        System.out.println(bean);
    }
}
