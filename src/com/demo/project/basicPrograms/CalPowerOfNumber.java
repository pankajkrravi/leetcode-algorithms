package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 1:14 PM
 */
public class CalPowerOfNumber {
    public static void main(String[] args) {
        int number= 5, power =3,result=1;
        if (number >=0 && power == 0)
            result = 1;
        else if (number == 0 && power >= 1)
            result =0;
        else{
            for (int i=1;i<=power;i++){
                result= result*number;
            }
        }
        System.out.println(number+"^"+power+" = "+result);
    }
}
