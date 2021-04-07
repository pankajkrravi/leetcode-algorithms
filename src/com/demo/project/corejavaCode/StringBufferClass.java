package com.demo.project.corejavaCode;
 /*StringBuffer class is used to create and modify(append 2 string, create new ,
  insert string among different string the String)
 String class create immutable object(can not change or modify after their creation
 --> String takes less memory
 StringButter class create Mutable object(After creation of object, you can change or,
 modify the value of object in StringBuffer class
 .*/

public class StringBufferClass {
    public static void main(String[] args) {
        // String class create immutable object
        String string=new String("Hello");
        string.concat("guys!!!");
        System.out.println(string);
        System.out.println("======================================================");

        StringBuffer stringBuffer=new StringBuffer();// with capacity 16(by by default)
        StringBuffer stringBuffer1=new StringBuffer("pankaj kumar ravi");// capacity of buffer=33(16+17)
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer1.capacity());
        System.out.println(stringBuffer1.length()); // 17
        //StringButter class create Mutable object
        StringBuffer stringBuffer2=new StringBuffer("Hello");
        stringBuffer2.append("Guys !!!!!");//append() is used -->  SBuffer but in String <--concat()
        System.out.println(stringBuffer2);
    }
 }
