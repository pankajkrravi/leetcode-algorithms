package com.demo.project.corejavaCode;

public class MultiThread {
        public static void main(String[] args) {
            System.out.println("==============================");
          ThredM1 thredM1=new ThredM1();
          ThredM2 thredM2=new ThredM2();
            Thread thread1=new Thread(thredM1);
            Thread thread2=new Thread(thredM2);
            thread1.start();
            thread2.start();
        }
    }
    class ThredM1 implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<20;i++)
            {
                System.out.println("run !!!!!!!!!!!!!!!! "+ i);
            }
        }

    }
    class ThredM2 extends Thread{
        @Override
        public void run() {
            for (int i=0;i<20;i++)
            {
                System.out.println("run ################ "+i);
            }
        }
    }