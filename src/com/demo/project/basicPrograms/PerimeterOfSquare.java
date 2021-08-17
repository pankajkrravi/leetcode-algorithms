package com.demo.project.basicPrograms;

import java.util.Scanner;

/**
 * @Author pankaj
 * @create 8/16/21 9:38 AM
 */
// WAP to calculate perimeter of Square

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the square :");
        double a=scanner.nextDouble();
        double perimeter = 4*a;
        System.out.println("Perimeter of Square is : "+perimeter);
    }
}
