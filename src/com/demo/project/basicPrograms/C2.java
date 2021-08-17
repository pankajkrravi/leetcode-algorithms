package com.demo.project.basicPrograms;

/**
 * @Author pankaj
 * @create 8/17/21 7:45 AM
 */
public class C2 {
        public void getSB (StringBuffer a, StringBuffer b) {
            a.append ("B");
            a = b;
        }
        public static void main (String args [ ] ) {
            C2 c = new C2();
            StringBuffer a = new StringBuffer ("A");
            StringBuffer b = new StringBuffer ("B");
            c.getSB(a, b);
            System.out.print(a);
        }

}
