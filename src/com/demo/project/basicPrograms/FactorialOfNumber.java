package com.demo.project.basicPrograms;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 8/16/21 9:43 AM
 */
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Number to calculate Factorial : ");
        int number=scanner.nextInt();
          int factorial=1;
        for (int i=1;i<=number;i++) {
            factorial =factorial*i;
        }
         System.out.println("Factorial of number: "+number+" ! = "+factorial);
        System.out.println("================ Recursion call ============");
        int result = calFactorial(number);
        System.out.println(number+" ! = "+ result);
    }
    // Recursion method

    public static int calFactorial(int number){
        int fac=0;
        if (number == 0 )
            return 1;
          else
           return number*calFactorial(number-1);
    }
 }
