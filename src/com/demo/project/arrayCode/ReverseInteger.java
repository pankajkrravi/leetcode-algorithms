package com.demo.project.arrayCode;
// # 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//Example 1:
//
//Input: x = 123
//Output: 321
public class ReverseInteger {
    public int reverse(int x) {
        int reversed=0;
        int pop;
        while(x!=0)
        {
            pop=(x%10);
            x/=10;

            if(reversed>Integer.MAX_VALUE/10 ||reversed == Integer.MAX_VALUE &&
                    pop>7)
                return 0;
            if(reversed<Integer.MIN_VALUE/10 || reversed==Integer.MIN_VALUE/10&&
                    pop < -8)
                return 0;

            reversed=(reversed*10)+pop;
        }
        return reversed;
    }
}
