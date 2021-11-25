import javax.xml.namespace.QName;
import java.util.Scanner;

/*
Create  a base class Fruit with name ,taste and size as its attributes.
 Create a method called eat() which describes the name of the fruit and its taste.
  Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste
 */
public class Fruit {
    String name;
    int size;
    String tast;
   public void eat(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name of the Fruit");
       name=sc.nextLine();
       System.out.println("entre the taste of the Fruit ");
       tast= sc.nextLine();
       System.out.println("This is the "+name+" the Fruits" );
       System.out.println("This is the "+tast +" the Fruits ");
   }
}
class Apple extends Fruit{
    @Override
    public void eat() {
        super.eat();
        System.out.println("This FRUITS  name is Apple ");
    }
}
class Orange extends Fruit{
    @Override
    public void eat() {
        super.eat();
        System.out.println("This Fruits is a orange ");
    }

    public static void main(String[] args) {
        Apple obj=new Apple();
        obj.eat();
        Orange obj1=new Orange();
        obj1.eat();

    }
}