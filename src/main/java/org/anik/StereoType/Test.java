package org.anik.StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student = (Student) context.getBean("ob");
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass());
    }
}
