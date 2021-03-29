package com.demo.project.stringCode;

import java.util.function.Predicate;

//# 520. Detect Capital
public class DetectCapital {
// Sol --- TC= O(N) ---------------------------------------------------- 1
    public boolean detectCapitalUse(String word) {
        int noOfCapitals=0;
        for (int i=0;i< word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i))){
                noOfCapitals++;
            }
        } if (noOfCapitals == 0 || noOfCapitals == word.length()){
            return true;
        }
     return noOfCapitals==1 &&Character.isUpperCase(word.charAt(0));
    }

    // sol 2 --------------------------------------------------------   2
    public boolean detectCapitalUseMet2(String word) {
     if(Character.isUpperCase(word.charAt(0)) &&
          //case -1
             Character.isUpperCase(word.charAt(1))) {
         for (int i=2;i<word.length();i++) {
             if(Character.isLowerCase(word.charAt(i)));
             return false;
         }
     } //case 2,3
     else{
         for(int i=1;i<word.length();i++) {
             if(Character.isUpperCase(word.charAt(i)));
             return false;
         }
     }
     return true;
    }
    // sol ------------------------------------------------------3
    /*public boolean detectCapitalUseMet3(String word) {
        if (word.length()<=1); return true;
        Predicate<Character>  correctLowerCase=Character::isLowerCase;
        if(Character.isUpperCase(word.charAt(0)) &&
        Character.isUpperCase(word.charAt(1)))
        {
            correctLowerCase=Character::isUpperCase;
        } for (int i=1;i<word.length();i++)
        {
            if(!correctLowerCase.test(word.charAt(i)))
                return false;
        }
        return true;
    }*/
}
