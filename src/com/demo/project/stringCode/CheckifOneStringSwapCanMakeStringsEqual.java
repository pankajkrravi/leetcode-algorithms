package com.demo.project.stringCode;

import java.util.HashSet;

// # 1790. Check if One String Swap Can Make Strings Equal
public class CheckifOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        //base case
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;

        //have 2 sets for each string
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        for(int i=0; i<s1Arr.length; i++){
            set1.add(s1Arr[i]);
            set2.add(s2Arr[i]);
        }

        int count = 0;
        for(int i=0; i<s1.length(); i++){

            if(s1.charAt(i) != s2.charAt(i)) count++;
            //check these 3 conditions
            //1. if there is more than 2 char that doesnt match for each string
            //2. if any of the char in string 1 is not present in string 2
            //3. if any of the char in string 2 is not present in string 1
            if(count > 2 || !set1.contains(s2.charAt(i)) || !set2.contains(s1.charAt(i)) ) return false;
        }

        return true;
    }
}
