public class containership {
    public static void main (String []args){
        System.out.println();
        Laptop obj=new Laptop();
        obj.p1.price=100;
        obj.p1.name="hp";
        obj.p1.weight=2;
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
