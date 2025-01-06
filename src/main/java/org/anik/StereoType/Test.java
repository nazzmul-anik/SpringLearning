package org.anik.StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student = (Student) context.getBean("ob");
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass());
        System.out.println(student.hashCode());

        Student student2 = (Student) context.getBean("ob");
        System.out.println(student2.hashCode());

        Teacher teacher1 = (Teacher) context.getBean("teacher");
        Teacher teacher2 = (Teacher) context.getBean("teacher");

        System.out.println("Teacher's");
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());

    }
}
