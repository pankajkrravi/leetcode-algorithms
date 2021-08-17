package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 7:53 AM
 */
// TypeCast #2
public class B1 {
        public String f1() {
            return "fb";
        }
    }

    class D extends B1 {
        public String f1() {
            return "fd";
        }

        public static void main(String[] args) {
            B1 b = new B1(); D d = (D)b;
        }
}
