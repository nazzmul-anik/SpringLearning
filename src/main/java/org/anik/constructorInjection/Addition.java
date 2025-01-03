package org.anik.constructorInjection;

public class Addition {
    private int a;
    private int b;

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("I am double constructor.");
    }
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("I am integer constructor.");
    }

    public Addition(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println(" I am string constructor.");
    }

    public void doSum(){
        System.out.println("Sum = " + (this.a + this.b));
    }
}
