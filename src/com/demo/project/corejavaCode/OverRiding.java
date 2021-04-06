package com.demo.project.corejavaCode;
 /*Adv of Using Encapsulation:
 1. If you want to change the definition of a method of parent class, you can do that in child class
 2. Multiple implementation can be provided by same method
 3. We can change the impl of super class method
  ============ WE CANT USE OVERRIDING IN FOLLOWING situation ============
  1. if parent class method is private
  2. static , final method cant be overridden
  3. Constructor can not be overridden

*/

public class OverRiding {
    public void doSomething() // overridden method
    {
        int a=5;
   System.out.println("parent class def :::" +a);
    }
}
 class ChildOverriding extends Encapsulation{
      void doSomething() //overriding method
      {
          int var=81;
          System.out.println("Child class def !!!! " +var);
      }

     public static void main(String[] args) {
         ChildOverriding child=new ChildOverriding();
         child.doSomething();
      // OverRiding oo=  new ChildOverriding(); // incompatible types


     }
 }