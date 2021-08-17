package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 12:10 PM
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int calculate=0,digit,temp;
        int number=153;//its an ArmstrongNumber number
        temp = number;
        while (number > 0){
            digit = number%10;
            number =number/10; // remove last one digit
            calculate = calculate+(digit*digit*digit);
        }
        if (temp == calculate)
            System.out.println(temp+ " is a Armstrong  Number  ");
        else
            System.out.println(temp+" is not a Armstrong  Number ");
    }
}
