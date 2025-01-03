package org.anik.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("referenceconfig.xml");
        B b = (B)context.getBean("b-ref");
        System.out.println("B value = "+b.getY());
        A a = (A) context.getBean("a-ref");
        System.out.println("A value = " + a.getX());
        System.out.println("B value by A = "+ a.getObj().getY());
    }
}
