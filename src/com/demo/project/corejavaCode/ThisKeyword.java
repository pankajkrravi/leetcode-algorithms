package com.demo.project.corejavaCode;

/*this keyword
reference variable
1. used to refer any member of current class variable
2. used to invoke current class constructor
*/
public class ThisKeyword {
    int i,j,k;//instance variable
    void setValues(int i,int j)
    {
       /* i=i;
        j=j;*/
        //1. used to refer any member of current class variable
        System.out.println("%%%%%%%%%% Setting values to current class by setValues() %%%%%%%%%%%%");
        this.i=i;
        this.j=j;
    }
        ThisKeyword(){
            System.out.println("!!!!!!!!!! Calling Default constructor !!!!!!!!!!");
        }
    //2. used to invoke current class constructor
    ThisKeyword(int i,int j)
    {
        System.out.println(" @@@@@@@ Calling Parameterized constructor  @@@@@@@@@@@2");
        this.i=i;
        this.j=j;
    }
    void show()
    {
        System.out.println(" ============ Calling show(int,int) ==============");
        System.out.println(i);
        System.out.println(j);
    }
    ThisKeyword(int i,int j,int k)
    {
        /*this.i=i;
        this.j=j;*/
         this(i,j); // calling to this() must be first statement- if u r calling constructor values
        this.k=k;
        System.out.println(" +++++++++++ Calling parameterized constructor of (int,int,int) +++++++++++++");
    }
    void showMultipleValues()
    {
        System.out.println("########## Calling showMultipleValues() ########");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
class RunThis{
    public static void main(String[] args) {
        ThisKeyword thisKeyword=new ThisKeyword();
        thisKeyword.setValues(45,77);
        thisKeyword.show();
    }
}
