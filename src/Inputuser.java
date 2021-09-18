import java .util.*;
class Sachin{
    int salary;
    float tex;
    String name;
    double total;
    Sachin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the salary");
        salary=sc.nextInt();
        System.out.println("entre the tex of goverment ");
        tex=sc.nextInt();
        sc.nextLine();
        System.out.println("entre the name of costumer ");
        name=sc.nextLine();
        total=salary+tex;
        System.out.println("this the total of the class "+total);


    }
    public void show(){
        System.out.println("this is the salary of costumer "+salary);
        System.out.println("this is the tex of goverment"+tex);
        System.out.println("this the name of costumer "+name);
    }
}

public class Inputuser {
    public static void main(String[] args) {
        Sachin obj=new Sachin();
        obj.show();
    }
}
