package com.demo.project.corejavaCode;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

/*MultiThreading
 A thread works as a subprocess
 An application will have min of 1 thread
 MultiThreading mean executing 2 or > 2 tasks concurrently within single program
    Example 1.
     thread1: spelling check
     thread2: auto save
     thread3: writing
     thread4": no of lines
     Ex: 2. Any website
     thread1: pop-ups
     thread2: video
     thread3: audio
     thread4: Auto-fill
 java.lang.Thread
 way1. By extending thread class
  you must write public run() with logic u want to execute
  call start() - to begin execution, in order to trigger thread, u need to call
 way 2. by implementing runnable interface

*/
 public class MultiThreading {
     public static void main(String[] args) {
         System.out.println("==============================");
         Thred1 thred1=new Thred1();
        // thred1.print1();
         thred1.start();
         Thred2 thred2=new Thred2();
        // thred2.print2();
         thred2.start();
     }
}
class Thred1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++)
        {
            System.out.println("run !!!!!!!!!!!!!!!!");
        }
    }

        /*void print1()
     {
         for (int i=0;i<5;i++)
         {
             System.out.println("Thread1 !!!!!!!!!!!!!!!!");
         }
     }*/
}
class Thred2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++)
        {
            System.out.println("run ################");
        }
    }

     /*void print2()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Thread2 ################");
        }
    }*/
}