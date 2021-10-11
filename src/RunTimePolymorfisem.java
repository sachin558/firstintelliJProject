/*
This is the run time polymorfisem
 */

public class RunTimePolymorfisem {
    public void M1(){
        System.out.println("this thew perent class ");
    }
}
class chind extends RunTimePolymorfisem{
    public void M1(){
        System.out.println("this  is the child class  ");
    }
}
class Test7 {
    public static void main(String[] args) {
        RunTimePolymorfisem obj=new chind();
        obj.M1();

    }
}
