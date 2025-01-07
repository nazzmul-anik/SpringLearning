package org.anik.javaconfig;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    public void study(){
        System.out.println("Student is reading book.");
    }
}
