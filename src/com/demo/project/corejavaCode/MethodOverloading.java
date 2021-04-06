package com.demo.project.corejavaCode;
 /*Rules for Method Overloading:
1. No of arguments should be different or,
2. sequence of arguments must be different or,
3. Type of arguments must be different
Adv ::
    1. readability of code
    2. cleanliness of code.
    3. flexibility to call a similar method for different types of data.
    4. Constructors can also be overloaded and this helps in initialising
    instance variables with different values. We get different object with different constructors.
*/
public class MethodOverloading {
    // ############## 1. No of arguments should be different or, ###############
    public void add(int number1, int number2)
    {
        System.out.println("Addition of "+number1 +" and "+number2 +" + "+number1+number2);
    }
    public void add(int number)
    {
        System.out.println("Method with one arg of type int ");
    }
    //#################### 2. sequence of arguments must be different ###############
    public void add(int num1,float num2)
    {
        System.out.println("int , float sum :: "+num1+num2);
    }
     public void add(float num1, int num2)
     {
        System.out.println("float , int method :: sum :: "+num1+num2);
     }
    // ################# 3. Type of arguments must be different #############

}
