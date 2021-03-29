package com.demo.project.mixedCode;

//# 13. Roman to Integer
//Constraints:
//
//1 <= s.length <= 15
//s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//It is guaranteed that s is a valid roman numeral in the range [1, 3999].

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>(){{

            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }};
        int sum = 0;
        sum += map.get(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            sum += map.get(s.charAt(i));
            if(map.get(s.charAt(i)) > map.get(s.charAt(i - 1)))
                sum -= map.get(s.charAt(i - 1)) * 2;
        }
        return sum;
    }
    //Sol ------------------------------------------------2
    public int romanToIntSol(String s) {
        int nums[]=new int[s.length()];
        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }
        int sum=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
        }
        return sum+nums[nums.length-1];
    }
}
