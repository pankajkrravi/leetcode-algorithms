package com.demo.project.corejavaCode;
// 2 --> Polymorphism - A method taking different forms is called Polymorphism
// There are two types of polymorphism 1. static Polymorphism/compile time Polymorphism(overloading)
// 2. Dynamic/Runtime Polymorphism(overriding)
public class Polymorphism {
    public void add()
    {
        System.out.println("No parameters");
    }
    public void add(int x)
    {
        System.out.println("Single parameter "+x);
    }
    public void add(int x,int y)
    {
        System.out.println("Double parameter "+x+" and "+y);
    }
}
 class MainRunner{
     public static void main(String[] args) {
         Polymorphism polymorphism= new Polymorphism();
         polymorphism.add();
         polymorphism.add(65);
         polymorphism.add(45,98);
     }
 }
