package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 1:38 PM
 */
public class EvenPositionArrayPrint {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i=1;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
