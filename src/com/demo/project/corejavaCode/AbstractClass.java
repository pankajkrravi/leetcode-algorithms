package com.demo.project.corejavaCode;
// 3 --> AbstractClass
/*
 Rules for AbstractClass
 Rule 1. abstract keyword- we cant create object for AbstractClass
 Rule 2. We cant create object for abstract class, we will create obj for it's subclass
 Rule 3. If you are declaring normal method in abstract class, you can have definition for that method
 Rule 4. we can not declare abstract() in normal class, if you are wring you must make class as abstract
 Rule 5. It's not necessary for every abstract class have abstract method, we can have normal method as well
 Rule 6. You can declare multiple no of abstract methods in abstract class
 Rule 7. You can use multiple inheritance in case of abstract class
    Note: Purpose of using abstract class and abstract(), is to hide implementation details
       or, Abstract class works as the Base class foe the  sub class
*/

public abstract class AbstractClass {
    public void def()
    {

    }
    // abstract() can't have definition(implementation) in abstract class, we must write in derived class
    // If we will try to write , it will give compile time error saying "abstract method can not have body"
    abstract public void absMethod();
}

   abstract class DerivedClass extends AbstractClass
  {
      @Override
      public void absMethod() {

      }
      public abstract void adsMethod2();
  }
  class ThirdLevelClass extends DerivedClass{

      @Override
      public void adsMethod2() {

      }
      // we can have definition of absMethod() in ThirdClass or DerivedClass
      @Override
      public void absMethod() {
          super.absMethod();
      }
  }