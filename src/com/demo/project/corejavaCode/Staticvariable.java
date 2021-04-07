package com.demo.project.corejavaCode;

/*
static variable(also known as Class Variables.) can be used to refer to the common property of all
objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
Advantages of static variable::
        It makes your program memory efficient (i.e., it saves memory).
        Note: In case of static variable, only one copy is created and shared among al the abjects
        i.e, Whatever the value updated for static variable, will keep on updating, and in case of non non static
        everytime new copy will be created.
*/

public class Staticvariable {
    int a=20;
    static int b=10;
    public void displayVal()
    {
        a=a+10; //30 //30
        b=b+30; //40 //70 //100
        System.out.println("non static, a = "+a);
        System.out.println("static , b = "+ b);
    }
}

class mainStatic{
    public static void main(String[] args) {
        Staticvariable staticvariable=new Staticvariable();
        staticvariable.displayVal();
        Staticvariable  staticvariable1=new Staticvariable();
        staticvariable1.displayVal();
        Staticvariable  staticvariable2=new Staticvariable();
        staticvariable2.displayVal();
    }
}