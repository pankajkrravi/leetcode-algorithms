package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/23/21 1:33 PM
 */
import java.util.*;

 /*input         String Str = "JAVA";
 output;
 j = 1
a= 2
v = 1
*/
public class  CountCharFromString {

    public static void main(String[] args) {

        String Str =  "JAVA";

        char charStr[] = Str.toCharArray();

        int count = 0;
        for (int i = 0; i < charStr.length; i++) {

            for (int j = 0; j < charStr.length; j++) {

                if (charStr[i] == charStr[j]) {
                    count++;

                } if(count ==1 ) {
                    System.out.println(charStr[i] + " = " + count);
                }
            }
        }
    }
    }