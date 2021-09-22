import java.util.*;
public class AarryFristPro {
    int roll;
    String name;
    int marks[];
    AarryFristPro(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the roll number ");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.println("entre the name of the student");
        name=sc.nextLine();
        marks=new int[6];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("entre the marks till 6 digits number ");
            marks[i]=sc.nextInt();
        }
    }
    void display(){
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }

    public static void main(String[] args) {
        AarryFristPro obj=new AarryFristPro();
        obj.display();
    }
}
