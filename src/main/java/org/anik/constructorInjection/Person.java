package org.anik.constructorInjection;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certificate certificate;
    private List<String> list;

    public Person(){

    }
    public Person(String name, int personId, Certificate certificate, List<String> list) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", list=" + list +
                '}';
    }
}
