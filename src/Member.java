//Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class.
// The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
// Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
import javax.xml.namespace.QName;
import java.lang.ref.PhantomReference;
import java.util.Scanner;
public class Member {
    String Name;
    int Age;
    double phone_no;
    String Address;
    double Salary;
    void printSalary(){
        System.out.println("This the all detalis "+" This the Salarry "+Salary+"This is the name "+Name+" This is the age  "+Address+" This the Age   "+Age);
    }
}
class Employee89 extends Member{
    Employee89(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the employee ");
        Name= sc.nextLine();
        System.out.println("enter the age of employee");
        Age=sc.nextInt();
        System.out.println("enter the phone_no of the employee ");
        phone_no=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the Address in tems of String format ");
        Address=sc.nextLine();
        System.out.println("entrce the salary  of the employee");
        Salary=sc.nextInt();
        System.out.println("enter the specialization");
        String se=sc.nextLine();
        System.out.println("entere the department of the employee ");
        String pe=sc.nextLine();
    }
}
class Maneger extends Member{
    Maneger(){
        super();
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the specialization fild ");
        String se=sc.nextLine();
        System.out.println("enter the deparment of the employee ");
        String pe=sc.nextLine();
    }
    public static void main(String[] args) {
        Employee89 obj=new Employee89();
        Maneger obj1=new Maneger();
        obj.printSalary();
        obj1.printSalary();
    }
}
