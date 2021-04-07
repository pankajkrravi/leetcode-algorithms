package com.demo.project.corejavaCode;
/* Use of su[per keyword::
 1. Used in the concept of inheritance
 2. Used to access parent class member(A. instance variable ,B.instance method)
 3.Used to call parent class constructor
*/
public class SuperKeyword {
    int i;
    int j=500;
    public void Method()
    {
     System.out.println("parentClass==>> Method()");
    }
    SuperKeyword(){}
    //Used to call parent class constructor
   SuperKeyword(int j)
   {
     this.j=j;
     System.out.println("parent class constructor() is called ");
   }
}


 class SubClass extends SuperKeyword
 {
  int i;
  int j=900;
  // Used to access parent class member(A.instance variable)
  public void setValueAndPrint()
  {
      i=11; // assign the value to current class(SubClass)
      super.i=55;// assign value of i of Parent class(SuperKeyword)
      System.out.println(" Setting value of i to parent class using super.i :: " +super.i);
      System.out.println("Current class(Sub class) value of i :: " +i );
  }
  //Used to access parent class member(B.instance method)
  public void Method()
  {
   System.out.println("subClass ===>>> Method()");
  }
    public void callingMethod()
    {
     Method();
     super.Method();
    }
     SubClass(){

     }
    // 3.Used to call parent class constructor
  SubClass(int j,int k)
  {
   super(j);
   j=k;
      System.out.println("super() constructor "+ super.j);
      System.out.println("sub() constructor "+j);
  }
 }


 class RunSuper{
  public static void main(String[] args) {
   SubClass subClass=new SubClass();
     subClass.setValueAndPrint();
     System.out.println("====================================================");
     subClass.callingMethod();
     System.out.println("----------------------------------------------------");
     SubClass subClass1=new SubClass(22,88);
  }
 }
