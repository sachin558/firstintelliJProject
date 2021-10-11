/*
This the Dynamic dispatch Method
 */

public class DynamicDispachMethod {
    public void M1(){
        System.out.println("this is the prent class");
    }
}
class Child extends DynamicDispachMethod{
    public void M1(){
        System.out.println("this the child ");
    }
}
class  child1 extends DynamicDispachMethod{
    public void M1(){
        System.out.println("this i the child1");
    }

    public static void main(String[] args) {
        DynamicDispachMethod obj=new Child();
        obj.M1();
        obj=new child1();
        obj.M1();
    }
}
