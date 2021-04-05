package com.demo.project.corejavaCode;
//1-->  Purpose od inheritance --> 1. To use the properties odf another class
// 2. Reusability of the code

public class Super {
    int i,j;
    void set(int x,int y)
    {
        i=x;
        j=y;
    }
}
 class Child extends Super //Child class inheriting the properties oc class super
 {
    int total;
    void sum()
    {
        total =i+j;
    }
 }

 class mainRunner
 {
     public static void main(String[] args) {
         Child child=new Child();
         child.set(12,13);
        child.sum();
       System.out.println(child.total);
     }
 }