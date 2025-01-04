package org.anik.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("icecreamconfig.xml");
        context.registerShutdownHook();
        IceCream cream = (IceCream) context.getBean("iceCream");
        System.out.println(cream);
        System.out.println("===========================");

        SoftDrink softDrink = (SoftDrink) context.getBean("softDrink");
        System.out.println(softDrink);

        System.out.println("================================");
        Example subject = (Example) context.getBean("example");
        System.out.println(subject);
    }
}
