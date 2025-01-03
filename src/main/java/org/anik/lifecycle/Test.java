package org.anik.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("icecreamconfig.xml");
        IceCream cream = (IceCream) context.getBean("iceCream");
        System.out.println(cream);
        context.registerShutdownHook();
    }
}
