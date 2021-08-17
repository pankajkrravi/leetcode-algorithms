package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 8:16 AM
 */
// // This code filters an array to remove all numbers less than 0 from it:
public class ArrayFiltering {
    void filter(ArrayList<Integer> b) {
        int i=0;
        while(i<b.size())
            if (b.get(i) < 0)
                b.remove(i);
            else
                i++;
    }
}
