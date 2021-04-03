package com.demo.project.stringCode;
// # 1221. Split a String in Balanced Strings
public class SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int balance = 0;

        for (char c : s.toCharArray() )
        {
            if (c == 'L')
            {
                balance++;
            }
            else
            {
                balance--;
            }

            if (balance == 0)
            {
                ans++;
            }
        }
        return ans;
    }
}
