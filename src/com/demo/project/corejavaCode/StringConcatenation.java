package com.demo.project.corejavaCode;
/*
concatenation of multiple string can be done in 2 different ways:::
1. Using + Operator
2. Using concat() - inbuilt method
*/
public class StringConcatenation {
    public static void main(String[] args) {
        //1. Using + Operator
        String greet="Hello";
        String fname=" Pankaj";
        String lname=" Kumar";
        String fullMessageGreet=greet+fname+lname;
        System.out.println(fullMessageGreet);
        String msg2=greet+" Ms. Laila";
        System.out.println(msg2);
        String msgWithNumber=greet+" Mr Mohan Raj"+10+14;// (Hello Ms. Laila10)+14; = Hello Ms. Laila1014
        System.out.println(msgWithNumber);
        String ms3=greet+" Mr Mohan Raj"+(10+14);// greet+24 = Hello Mr Mohan Raj24
        System.out.println(ms3);
        System.out.println("=====Using concat(String) - inbuilt method =======");
        String  hii="Hii";
        String con2=hii.concat(" Everyone");
        System.out.println(con2);
        String con3=hii.concat(" Everyone").concat(" How are you??");
        System.out.println(con3);
        String con4=hii.concat(" Everyone").concat(" How are you??")+" plz message !!";
        System.out.println(con4);
    }
}
