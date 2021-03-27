package com.demo.project.stringCode;
 // # 344. Reverse String
 //Write a function that reverses a string. The input string is given as an array of characters s.
public class ReverseString {
     public static void main(String[] args) {
         char[] charArrayStr = {'H', 'e', 'e', 'l', 'o'};
         reverseString(charArrayStr);
     }
    // You must do this by modifying the input array in-place with O(1) extra memory.
     public static void reverseString(char[] s) {
         if (s.length <= 1) {
             return;
         }
         int j = 0;
         int i = s.length - 1;
         while (i > j) {
             char tmp;
             tmp = s[j];
             s[j] = s[i];
             s[i] = tmp;
             j++;
             i--;
         }
         //print array
         for (char c : s) {
             System.out.println(c);
         }
     }
 }