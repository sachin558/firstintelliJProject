/* Write a program to find the hight salary and there name  of the employee who is  working in the A company  or B company
*/
import java .util.Scanner;
public class Employee1 {
    int id;
    String name;
    String c_name;
    int sal;
    public Employee1(String c_name, String name, int id, int sal) {
        this.id = id;
        this.name = name;
        this.c_name = c_name;
        this.sal = sal;
    }
    public static void result(Employee1 tarr[])
    {
        int maxsal1= Integer.MIN_VALUE , maxsal2= Integer.MIN_VALUE;
        int Aindex=0, Bindex=0;
        for (int i = 0; i <tarr.length ; i++) {
            if (tarr[i].c_name.equals("A") && tarr[i].sal > maxsal1) {
                maxsal1 = tarr[i].sal;
                Aindex = i;
            }
            if (tarr[i].c_name.equals("B") && tarr[i].sal > maxsal2) {
                maxsal2 = tarr[i].sal;
                Bindex = i;
            }
        }
        System.out.println("The Employee name is = "+ tarr[Bindex].name + " sal = "+ tarr[Bindex].sal+  " Commpany name = "+ tarr[Bindex].c_name);
        System.out.println("The Employee name is = "+ tarr[Aindex].name + " sal = "+ tarr[Aindex].sal+  " Commpany name = "+ tarr[Aindex].c_name);
    }
}
class Employee1Test
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many objects you want to create");
        int size= s.nextInt();
        Employee1 arr[] = new Employee1[size];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("enter companyname, employeename, id, salary");
            // creating object by using the new and initializing object by
            // using the parameterized constructor
            arr[i] = new Employee1(s.next(),s.next(),s.nextInt(),s.nextInt());
        }
        Employee1.result(arr);
    }
}
