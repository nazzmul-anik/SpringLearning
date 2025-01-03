package org.anik.lifecycle;

public class IceCream {
    private double price;

    public IceCream() {
    }

    public IceCream(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void hi(){
        System.out.println("Hi, Everyone.");
    }

    public void bye(){
        System.out.println("Bye, Everyone.");
    }

    public void init(){
        System.out.println("Inside init method.");
    }

    public void destroy(){
        System.out.println("Inside destroy method.");
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Setting Price");
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "price=" + price +
                '}';
    }
}
