package org.anik.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorconfig.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
        System.out.println(person.getList().get(2));
        System.out.println("========================================");
        Addition addition = (Addition) context.getBean("addition");
        addition.doSum();
    }
}
