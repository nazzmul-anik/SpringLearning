package org.anik.StereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")
public class Student {
    @Value("Anik")
    private String studentName;
    @Value("Dhaka")
    private String city;
    @Value("#{addressList}")
    private List<String> address;

    public Student() {
    }

    public Student(String studentName, String city) {
        this.studentName = studentName;
        this.city = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
