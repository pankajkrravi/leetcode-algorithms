package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 8:04 AM
 */
public class Try2 extends Base2 {
    public String f1() {
        return "f1t";
    }
    public String f2() {
        return super.f1();
    }

    public static void main(String[] args) {
        Try2 t = new Try2();
        t.f2();
    }
}
