package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 1:40 PM
 */
public class PrintlargestArrayElement {
    public static void main(String[] args) {
        int arr[] ={25,11,7,75,56};
        int max= arr[0]; // initialize max with first element of array

        // loop through array
        for (int i=0;i<arr.length;i++){
            // compare elements of arraywith max
            if (max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest element in given array is =" +max);
    }
}
