package org.anik.autowireManual;

public class Employee {
    private Address address;

    public Employee() {
    }

    public Employee(Address address) {
        this.address = address;
        System.out.println("Inside Employee Constructor");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
