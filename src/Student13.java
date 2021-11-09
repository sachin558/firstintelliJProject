import jdk.jshell.spi.SPIResolutionException;

public class Student13 {
    int age;
    String name;
    String program;
    Student13(int age, String name,String program){
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
    }
}
class Student14 extends  Student13{
    Student14(int pre,String Stream){
        super(13,"sachin","computer scince");
        System.out.println(pre);
        System.out.println(Stream);
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(program);
    }

    public static void main(String[] args) {
        Student13 obj=new Student14(90,"electronic");
        obj.display();
        obj=new Student13(89,"gyan","mecenical");
        obj.display();
    }
}
