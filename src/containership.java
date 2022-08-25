import java.util.Scanner;

public class containership {
    public static void main (String []args){
        System.out.println();
        Laptop obj=new Laptop();
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the price of the laptop ");
        obj.p1.price=sc.nextInt();
        System.out.println("entre the company name of the name  ");
        obj.p1.name=sc.next();
        System.out.println("entre the weight of the laptop  ");
        obj.p1.weight=sc.nextInt();
        obj.display();
    }
}
class Processor
{
    int price;
    String name;
    int weight;
}
class Laptop
{
    String name ;
    int rame;
    Processor p1;
    Laptop ()
    {
        name="intel";
        rame=10;
        p1 = new Processor();
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(rame);
        System.out.println((p1.price));
        System.out.println(p1.name);
        System.out.println(p1.weight);
    }
}
