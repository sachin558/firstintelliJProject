public class MethodHiding {
    public static void M1(){
        System.out.println("this is the parent class ");
    }
}
class child extends MethodHiding{
    public static void M1(){
        System.out.println("this the child class ");
    }
}
class Test8 extends child{
    public static void M1(){
        System.out.println("this is the Test class ");
    }
}
class Test9{
    public static void main(String[] args) {
        MethodHiding obj=new child();
        obj.M1();
    }
}

