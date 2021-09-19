////Q4. Design an application in java that contains a class Student
//// having properties name and percentage. Create a class Test that declares three instances of Student class.
//// The values are passed through constructor at the time of its object creation.
//// The output should be the name and percentage of the topper.
////
import java .util.*;
public class StudentPer {
    String name;
    int per;
    class Test{
    }
    StudentPer(String a,int b){
        name=a;
        per=b;
    }

    public static void main(String[] args) {
        StudentPer obj=new StudentPer("sachin",90);
        System.out.println("this is name of topper student and their percentage = "+" "+obj.name+" "+obj.per+"%");
    }
}
