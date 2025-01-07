package org.anik.javaconfig;

import org.anik.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student1 = context1.getBean("student", Student.class);
        student1.study();

    }
}
