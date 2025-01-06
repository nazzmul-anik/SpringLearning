package org.anik.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22 + 2}")
    private int x;
    @Value("#{22/2}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private int z;
    @Value("#{T(java.lang.Math).E}")
    private double e;
    @Value("#{T(java.lang.Math).PI}")
    private double pi;
    @Value("#{ new java.lang.String('Md. Nazmul Hasan Anik')}")
    private String name;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", pi=" + pi +
                ", name='" + name + '\'' +
                '}';
    }
}
