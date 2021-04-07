package com.demo.project.corejavaCode;
/*


Multiple Inheritance:
class A,class B,class C
interface A,interface B,interface C
class A extends B
class A extends B,C // multiple inheritance
class B implements D,E
class A extends B implements D


 */


































































































































































































public class Multipleinheritance {
    public static void main(String[] args) {

    }
}
class A{
    void dsp()
    {
        System.out.println("disp() of class A is called");
    }
}
interface AIntr
{
    int a=55;//by d
    // by default all methods are abstract in interface
    // concrete method not allowed in interface
    void dispInt();
}