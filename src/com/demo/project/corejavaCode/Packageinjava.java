package com.demo.project.corejavaCode;

import com.demo.project.packages.PackageDemo;

/*
  builtin package": java.util, java.io, java.lang
  user defined package
  Access methods:
  1. import package.*;
  2. import package.class_name
  3. Full qualified class name

  package java--- io,util,lang
  public method:
  */
public class Packageinjava {
    public static void main(String[] args) {
      PackageDemo packageDemo=new PackageDemo();
      packageDemo.display1();//public method can be called
      packageDemo.display2();//public method can be called
        //packageDemo.display13();////default method can't be called of other package
        //Test test=new Test(); //cant called because its default class from other package

    }
}
