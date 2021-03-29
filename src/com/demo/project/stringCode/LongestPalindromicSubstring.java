package com.demo.project.stringCode;
//5. Longest Palindromic Substring
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lss=new LongestPalindromicSubstring();
       System.out.println(lss.longestPalindrome("babad"));
    }
    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {
        int strLength =s.length();
        if(strLength<2)
            return s;

        for(int start = 0;start <strLength-1;start++)
        {
            expandrange(s,start,start);
            expandrange(s,start,start+1);
        }
        return s.substring(resultStart,resultStart+resultLength);
    }

    private void expandrange(String str,int begin,int end)
    {
        while(begin>=0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end))
        {
            begin--;
            end++;
        }
        if(resultLength < end - begin-1)
        {
            resultStart=begin+1;
            resultLength= end-begin-1;
        }
    }
}
