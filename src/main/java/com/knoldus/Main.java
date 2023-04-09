package com.knoldus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var bean = (MessagePrinter) context.getBean("MyMessagePrinter");
        bean.printMessage();
    }
}
