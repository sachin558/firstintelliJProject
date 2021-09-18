import java.awt.*;

//Q1) Write a program that would print the information (name, year of joining, address)
// of three employees by creating a class named 'Employee'. The output should be as follows:
public class InformationOfEmp {
    String name;
    int year;
    String address;
    void   Insert(String a,int b,String c){
        name=a;
        year=b;
        address=c;
    }
    void show(){
        System.out.println(name+"\t"+year+"\t"+address);
    }

    public static void main(String[] args) {
        InformationOfEmp obj=new InformationOfEmp();
        InformationOfEmp obj1=new InformationOfEmp();
        InformationOfEmp obj2=new InformationOfEmp();
        obj.Insert("sachin",2001,"Agra");
        obj1.Insert("yaskuma",2004,"Etah");
        obj2.Insert("mohiti",2002,"Mathura");
        System.out.println("Name"+"\t"+"year"+"\t"+"address");
        obj.show();
        obj1.show();
        obj2.show();
    }
}

