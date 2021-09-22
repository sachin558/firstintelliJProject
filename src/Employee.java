//Q3) Write a program by creating an 'Employee' class having the following methods and print the final salary
//1 - 'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
//2 - 'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
//3 - 'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.
import java.util.*;
public class Employee {
    int salary;
    int hours;
     void   getInfo(){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the salary");
         salary=sc.nextInt();
         System.out.println("entre the hours");
         hours=sc.nextInt();
    }
    void  AddSal(){
         if (salary<500) {
             salary += 10;
         }

    }
    void   AddWork(){
         if (hours>6) {
             salary+=5;
             //System.out.println(Tatal);
         }
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.getInfo();
        obj.AddSal();
        obj.AddWork();
        System.out.println("this the final salary of emloyee"+"\t"+obj.salary);
        System.out.println("here end the program");
    }

}
