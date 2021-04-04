package com.demo.project.stringCode;

import java.util.HashSet;
import java.util.Set;

// # 345. Reverse Vowels of a String--->  asked in ammazon
public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char [] characters=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while (i<j) {
            while(i<j && !vowels.contains(characters[i])){
                i++;
            } while (i<j && !vowels.contains(characters[j]))
            {
                j--;
            } //swapping
            char temp=characters[i];
            characters[i++]=characters[j]; //keep ++ until we found vowel
            characters[j--]=temp; // keep -- until we found vowel and swap as well
        }
        return new String(characters);
    }
}
