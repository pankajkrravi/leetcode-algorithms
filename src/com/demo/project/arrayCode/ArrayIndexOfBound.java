package com.demo.project.arrayCode;
//write a program to produce arrayindexoutofbound exception

public class ArrayIndexOfBound {
    public static void main(String[] args) {
        int intArray[]={1,2,3,4,5};
        for (int i=0;i<=5;i++)
        {
            System.out.println(intArray[i]);
        }
    }
}
