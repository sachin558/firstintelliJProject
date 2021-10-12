// by using the packeg
//Q1. Create a class Car having properties manufacturer and price.
// Create three instances of the class and display
// the details of each car sorted with respect to the price.
package i1;
import java.util.Scanner;
import java.util.concurrent.Callable;
public class CarPropertis {
    String name;
    int modle;
    int price;
    CarPropertis(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the name  of car ");
        name=sc.nextLine();
        System.out.println("entre the model of the car ");
        modle=sc.nextInt();
        System.out.println("entre the price of the car ");
        price= sc.nextInt();
    }
    void dispaly(){
        System.out.println("This is the name of the car "+" "+name);
        System.out.println("This  is the modle of the car "+" "+modle);
        System.out.println("This  is the price of the car "+" "+price);
    }
    public static void main(String[] args) {
     CarPropertis obj=new CarPropertis();
     obj.dispaly();
    }
}
