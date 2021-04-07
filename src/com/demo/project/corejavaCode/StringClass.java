package com.demo.project.corejavaCode;

import sun.awt.X11.XSystemTrayPeer;

/*
String:: Sequence of characters ex: pankaj
String class is present in lang package
  String can be created in 2 ways
  1. using Literals
  2. using new keyword

*/
public class StringClass {
    public static void main(String[] args) {
        //1. using Literals
        String myName="Pankaj Kumar Ravi";
        System.out.println(myName);
        // 2. using new keyword
        String nameOfCompany=new String("Goomo Holdings pvt ltd");
        System.out.println(nameOfCompany);
        // char array to  String
        char[] mycCarArr={'a','e','i','o','u'};
        String myStr=new String(mycCarArr);
        System.out.println(myStr);
    }
}
