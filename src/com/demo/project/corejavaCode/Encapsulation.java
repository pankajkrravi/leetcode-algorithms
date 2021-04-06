package com.demo.project.corejavaCode;
/*
 Encapsulation: is a technique, Principle of java, used to hide complexity of Program
   or, its used to hide data from outer classes, outer class can access private variable only by using public method
   Instead of accessing the variable of a class directly, we can access that variable via method--> it's called binding of data
Rule 1. make App member(variable) private
Rule 2. give public getters and setters gor all variable.

* */
public class Encapsulation {

    private int a;
    private double b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setA(12);
        encapsulation.setB(85.50);
        System.out.println(encapsulation.getA());
        System.out.println(encapsulation.getB());
    }
}
