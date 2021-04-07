package com.demo.project.corejavaCode;
 /*final keyword:: it's used in three different ways'
 a. final variable:
 b. final method:
 c. final class
---------------------------------------------------------------------
 a. final variable:
 1. Local variable
 2. Instance variable
 3. class variable(static variable)
 4. Parameterized variable
 * */
public class FinalKeyword {
    //2. Instance variable
       final int a=90;
       int b;
      // a=10; //CTE-> Unresolved compilation error
    /* FinalKeyword()
     {
         a=20;
     }*/
      //4. Parameterized variable
     public void ParameterizedMeth(final int finalValue)
     {
            b=finalValue;
            //finalValue+=10;
            System.out.println(b);
     }
    // 3. class variable(static variable)
        final static int sVal=10;
        // sVal+=10;
        void printStaticValue()
        {
            System.out.println(sVal);
        }

        void disp()
        {   // final variable -->1.  Local variable
            final int b=88;
            //b+=10; // once the value of final variable is initialized, u can't change its value,it will throw CTE
            System.out.println("Local variable >>>  !!! "+b);
            System.out.println("-------------------------------------------------------");
            System.out.println("Instance variable >>> "+ a);
        }
}

 /* class subFinal extends  FinalKeyword{
        int a;
        void disp()
        {
            System.out.println("Child class method");
        }
}*/
 class mainFinal{
     public static void main(String[] args) {
        FinalKeyword keyword = new FinalKeyword();
           keyword.disp();
         System.out.println("==========================");
         keyword.ParameterizedMeth(55);
         System.out.println("------------static variable -------------");
            keyword.printStaticValue();
     }
 }