package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 7:42 AM
 */
public class C {
    public void f(int[] array) {
        array[1]++;
    }

    public static void main(String args[]) {
        C c = new C();
        int[] arr = new int[1];
        c.f(arr);
        System.out.println(arr[1]);
    }
}