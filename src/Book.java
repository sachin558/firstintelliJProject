//Q2. Create a class Book with the following information.
//Member variables : name (String), author (of the class Author you have just created), price (double),
// and qtyInStock (int)
// [Assumption: Each book will be written by exactly one Author]
// Parameterized Constructor: To initialize the variables
//Getter methods  for all the member variables
import java.util.*;
public class Book {
    String name;
    String author;
    double price;
    int qtyInstock;
    Book(String a,String b,double c,int d){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the name of book");
        a= sc.nextLine();
        name=a;
        author=b;
        System.out.println("entre the price ");
        c=sc.nextInt();
        price=c;
        System.out.println("entere the qtyInstock");
        d= sc.nextInt();
        qtyInstock=d;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInstock() {
        return qtyInstock;
    }

    public static void main(String[] args) {
        Book obj=new Book("java ","sachin",4567342,1231);
        obj.getName();
        obj.getAuthor();
        obj.getPrice();
        obj.getQtyInstock();
        System.out.println("this is the book name"+obj.name);
        System.out.println("this the athour name "+" "+obj.author);
        System.out.println( "this the price of book "+" "+obj.price);
        System.out.println( "This is the ability of the stcok "+obj.qtyInstock);
    }
}
