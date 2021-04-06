package com.demo.project.corejavaCode;
 /*Array is a data structure, used to store data in sequential manner.
 It contains similar types of data
 Declaration od Array::

 int [] array1;
 int array1 [];

 Creation::
 array1=new int[10];

 */
public class ArrayClass {
     public int[] insertElementInArray(int size, int[] items) {
         int[] myArray = new int[size];
         for (int i = 0; i < size; i++) {
             myArray[i] = items[i];
         }
         return myArray;
     }

     //Logic to print array items
     public void printArrayItems(int[] resultantArray) {
         for (int ele : resultantArray)
             System.out.println(ele);
     }

     public static void main(String[] args) {
         ArrayClass arrayClass = new ArrayClass();
         int[] resultantArray = arrayClass.insertElementInArray(5, new int[]{1, 2, 3, 4, 5});
         arrayClass.printArrayItems(resultantArray);
     }
 }