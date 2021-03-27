package com.demo.project.stringCode;
import java.util.ListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString_Practice {
    public static void main(String[] args) {
        String inputString="malayalam";
        reverseString(inputString);

    }    // # Converting String to character array  ------------ 1
        public static void reverseString(String inputString)
        {
            char[] charArray=inputString.toCharArray();
            for (int i=charArray.length - 1;i>=0;i--)
            {
                System.out.print(charArray[i]);
            }
        }

// Java program to ReverseString using StringBuilder -------- 2
     public static String reverseStringUsingSBuilder(String str)
     {
        StringBuffer stringBuffer=new StringBuffer(str);
         return stringBuffer.reverse().toString();
     }

     // Java program to ReverseString using - manual approach  ----- 3
    public static String reverseStringManually(String str)
    {
        StringBuilder  stringBuilder=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--)
        {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
    // ReverseString,Using StringBuffer: String
    // class does not have reverse() method,
    // we need to convert the input string to
    // StringBuffer, which is achieved by using
    // the reverse method of StringBuffer. ------------------------- 4

        public static String reverseStringUsingSBuffer(String s)
        {
            StringBuffer stringBuffer=new StringBuffer(s);
            return stringBuffer.reverse().toString();
        }

    // Java program to Reverse a String using ListIterator ------------- 5
    //1. We copy String contents to an object
    //   of ArrayList.
    //1. We create a ListIterator object by using
    //   the listIterator() method on the ArrayList
    //   object.
    //2. ListIterator object is used to iterate over
    //   the list.
    //3. ListIterator object helps us to iterate
    //   over the reversed list and print it one
    //   by one to the output screen.

    public static void reverseStringUsingCollection(String s)
    {
        List<Character> list=new ArrayList<>();
        char [] charStr=s.toCharArray();
        for (Character c:charStr)
            list.add(c);
        Collections.reverse(list);
        ListIterator li=list.listIterator();
        while (li.hasNext())
        System.out.print(li.next());
    }

    //By Reverse Iteration -------------------------------------------6
    public static String reverseStringusingString(String str) {
        char []ch =str.toCharArray();
        String reversedString="";
        for (int i=ch.length-1;i>=0;i--)
        {
            reversedString=reversedString+ch[i];
        }
        return  reversedString;
    }

    //
}
