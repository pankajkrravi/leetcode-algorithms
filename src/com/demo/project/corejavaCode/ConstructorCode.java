package com.demo.project.corejavaCode;
 /* Constructor is a special type of method
 Constructor does not have any return type, Not even void
  Constructor name must be same as classname
  If we don't create Constructor default Constructor will be provided by compiler
  If you want to predefine the value of variable, in this case we can use Constructor
  We can also overload constructor
  Note: If you write parameterized constructor, in that case compiler will not provide default constructor
*/
public class ConstructorCode {
    //Default Constructor
     int i;
     float j;
     ConstructorCode(){
         System.out.println("Default constructor is called !!!!");
     }
    // If you want to predefine the value of variable, in this case we can use Constructor
    ConstructorCode(int i,float j){
        System.out.println("parameterized constructor is called !!!!");
        i=i;
        j=j;
        System.out.println(i);
        System.out.println(j);
    }
     ConstructorCode(int i){ //Constructor Overloading
         System.out.println("parameterized constructor is called  int !!!!");
         i=i;
     }
     public static void main(String[] args) {
         ConstructorCode code=new ConstructorCode();
         System.out.println(code.i); // default value 0
         System.out.println(code.j); //default value 0.0
        new ConstructorCode(10,20.54f); //Paremeterized constructor is called

     }
}
