/*Create a class 'Student' with three data members which are name,
 age and address. The constructor of the class assigns default values name as "unknown",
age as '0' and address as "not available". It has two member methods with the same name “setInfo”.
 First method has two parameters for name and age and assigns the same whereas
the second method takes three parameters which are assigned to name, age and address respectively.
 Print the name, age and address of 10 students */

import java.util.*;
public class Student {
    int  age;
    String name;
    String address;
    Student(){
        this.age ='0';
        this.name="unknown";
        this.address="not avilabale";
    }
    public void setInfo(String name, int age, String address ){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public void getInfo()
    {
        System.out.println("Student [name=" + name + ", age=" + age + ", address=" + address + "]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the number of Students ");
        x = sc.nextInt();
        ArrayList<Student> stu=new ArrayList<>(x);
        for (int i = 1; i <= x; i++)
        {
            stu.add(new Student());
        }
        for (int i = 0; i < x; i++) {
            stu.get(i).setInfo(sc.next(), sc.nextInt(), sc.next());
        }
        for (int i = 0; i < x; i++) {
            stu.get(i).getInfo();
        }
    }
}
