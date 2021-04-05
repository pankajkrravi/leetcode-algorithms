package com.demo.project.corejavaCode;

public abstract class AbstractClassExample {
    abstract void add();
    void subtraction()
    {
    System.out.println("subtraction ");
    }
    public abstract void multiply();
}
class Calculate2 extends AbstractClassExample{

    @Override
    void add() {
        System.out.println("Addition in class Calculate2 ");
    }

    @Override
    public void multiply() {

    }
}

class mainRunnerAbstract
{
    public static void main(String[] args) {
        Calculate2 calculate=new Calculate2();
        calculate.add();
        calculate.subtraction();
    }
}
