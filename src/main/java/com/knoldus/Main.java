package com.knoldus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessagePrinter printer = (MessagePrinter) context.getBean("messagePrinter");
        printer.printMessage();
    }
}

