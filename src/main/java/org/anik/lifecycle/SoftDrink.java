package org.anik.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SoftDrink implements InitializingBean, DisposableBean {
    private double price;
    public SoftDrink() {
    }
    public SoftDrink(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SoftDrink{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Taking SoftDrink : init()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Taking SoftDrink : destroy()");
    }
}
