package com.demo.project.arrayCode;

// # 66. Plus One
public class PlusOne {
    public int[] plusOne(int[] digits) {
            int n=digits.length-1;
                for (int i=n-1;i>=0;i--) {
                    if(digits[i] <9) {
                        digits[i]++;
                        return digits;
                    }
                    digits[i]=0; //if we found number 9
                }
                int [] newArray=new int[n+1];
                newArray[0]=1;
                return newArray;
        }
}
