package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 12:54 PM
 */
public class AddTwoMatrices {
    public static void main(String[] args) {
        int a [] [] ={{1,3,4},{2,4,3},{3,4,5}};
        int b [] [] = {{1,3,4,},{2,4,3},{1,2,4}};

        // new matrix to store sum of two array
        int result [] [] = new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                result[i][j] = a[i][j]+b[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
 }
