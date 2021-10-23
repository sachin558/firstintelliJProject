public class Multilevel_Inheritance {
    int a;
    String c;
    Multilevel_Inheritance(){
        a=90;
        c="sachin";
    }
    void display(){
        System.out.println(a+" "+c);
    }
}
class Demo89 extends Multilevel_Inheritance{
    int b=50;
    String n="daad";
    void display2(){
        System.out.println(b+" "+n);
    }
}
class Demo90 extends Demo89{
    int v=9;
    String m="gyan";
    Demo90(){
        super();
    }
    void display4(){
        System.out.println(v+" "+m);
    }

    public static void main(String[] args) {
        Demo90 obj=new Demo90();
        obj.display();
        obj.display2();
        obj.display4();
    }
}
