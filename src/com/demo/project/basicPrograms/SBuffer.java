package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 8:09 AM
 */
public class SBuffer {
        static  String n_times_n(int n) {
            StringBuffer b = new StringBuffer("0");
            int n_n = n*n;
            for (int i=0; i<n_n; i++) {
                b.append (", " + i);
            }
            return b.toString();
        }

    public static void main(String[] args) {
       // n_times_n(1000);
        n_times_n(2000);
    }
}
