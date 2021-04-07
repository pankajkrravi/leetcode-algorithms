package com.demo.project.corejavaCode;
 /*ChatAt() : used to get the character at specific index in String
   setChartAt(): used to set the character at specific index
   delete(): used to delete some contiguous characters from a string
   deleteCharAt(): used to delete specific character of a string
   insert() : used to insert a character or, string at specific index
* */public class StringMethod {
     public static void main(String[] args) {
         StringBuffer stringBuffer=new StringBuffer("Welcome Everyone");
         //ChatAt()
         char c =stringBuffer.charAt(5);
         System.out.println(c);
         //setChartAt():
         stringBuffer.setCharAt(5,'y'); //StringBuffer setCharAt(int index,char c);
         System.out.println(stringBuffer);
         // delete(int startIndex,int endIndex)
         stringBuffer.delete(1,3);
         System.out.println(stringBuffer);
         stringBuffer.delete(5,5);//if start and end index is same in that case there will not be any change in string values
         System.out.println(stringBuffer);
         //stringBuffer.delete(2,15);//if u are passing end index more than size in that case accept start index everything will bre deleted
        // System.out.println(stringBuffer);
         //stringBuffer.delete(17,15);// RTE--> StringIndexOutOfBoundsException
         stringBuffer.deleteCharAt(1);
         System.out.println(stringBuffer);
        //append()
         stringBuffer.append(" How are you????");
         System.out.println(stringBuffer);
         //insert(int index,String s| char c);
         stringBuffer.insert(1,'e');
         System.out.println(stringBuffer);
         System.out.println(stringBuffer);
         stringBuffer.insert(2, "lc");
         System.out.println(stringBuffer);
     }
}
