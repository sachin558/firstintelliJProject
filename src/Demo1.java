//definition class
import java.util.*;
class stu{
    int rolno;
    String name;
    int marks [];//declaration
    stu()// non paramiteris construture
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter the roll no");
        rolno=sc.nextInt();
        sc.nextLine();
        System.out.println("entre the name ");
        name=sc.nextLine();
        marks=new int [5];
       for (int i = 0; i < marks.length; i++) {
         marks[i]=8;
       }
   }
   public void display(){
       System.out.println(rolno);
       System.out.println(name);
       //System.out.println(marks);
       for (int i = 0; i <marks.length ; i++) {
           System.out.println(marks[i]);
       }
   }
}
public class Demo1 {
    public static void main(String[] args) {
        stu sc[]=new stu[5];
        for (int i = 0; i < sc.length; i++) {
            sc[i]=new stu();
        }
        for (int i = 0; i < sc.length; i++) {
            sc[i].display();
        }
        stu obj=new stu();
        obj.display();
    }
}
