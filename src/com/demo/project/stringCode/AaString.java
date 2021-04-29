package com.demo.project.stringCode;
// # 415 Add String ================================= //
public class AaString {
    /*public static String addStrings(String num1, String num2) {
        Integer inum1=Integer.parseInt(num1);
        Integer inum2=Integer.parseInt(num2);
        return String.valueOf(inum1+inum2);
    }

    public static void main(String[] args) {
        System.out.println(addStrings("100","123"));
    }*/
    // sol 1 ------------------------------------------------------------ 1
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
        // solution ------------------------------------------------- 2
    // return "" +(new BigInteger(num1).add(new BigInteger(num2)));
  }
