package com.demo.project;

import java.util.ArrayList;
import java.util.List;
 // # 412. Fizz Buzz
//Write a program that outputs the string representation of numbers from 1 to n.
//But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
// For numbers which are multiples of both three and five output “FizzBuzz”.
public class FizzBuzz {

    public static void main(String[] args) {

    }
    //                                       ----------------------------------------- 1
    public List<String> fizzBuzz(int n) {
        List<String> resultlist = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultlist.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultlist.add("Fizz");
            } else if (i % 5 == 0) {
                resultlist.add("Buzz");
            } else {
                resultlist.add(Integer.toString(i));
            }
        }
        return resultlist;
    }
    //
}
