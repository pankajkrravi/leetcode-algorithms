package com.demo.project.packages;

public class PackageDemo {
    public void display1()
    {
        System.out.println("display1() of PackageDemo class from packages called !!!!");
    }
    public void display2()
    {
        System.out.println("display2() of PackageDemo class from packages called !!!!");
    }
    void display3()
    {
        System.out.println("display3() of PackageDemo class from packages called !!!!");
    }
    void display4()
    {
        System.out.println("display4() of PackageDemo class from packages called !!!!");
    }

}
// in one package of .java file, more than one public class is not allowed->> CTE
/*
public class Test{

}*/
// default class is allowed., but we can,t call from other package
class Test{

}