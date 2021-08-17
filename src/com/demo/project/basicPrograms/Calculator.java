package com.demo.project.basicPrograms;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 8/11/21 11:06 AM
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int number_first = scanner.nextInt();
        System.out.println("Enter Second Number : ");
         int number_second = scanner.nextInt();
        System.out.println("Addition of First "+number_first+"  Number and Second Number "+number_second+"= "+(number_first+number_second));
        System.out.println("Subtract of First Number and Second Number = "+(number_first-number_second));
        System.out.println("Multiplication of First Number and Second Number = "+(number_first*number_second));
        System.out.println(" Division of First Number and Second Number = "+(number_first/number_second));

    }
}
