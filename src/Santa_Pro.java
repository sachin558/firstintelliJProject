import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

//. Santa  runs a local musical equipment store in your neighbourhood. He has contracted
// you to create an interactive application that will assist him with customer purchases. Create a class named
//Customer Purchases that will contain get and set methods for a customer number, first name, surname, product, price and quantity.
// Create a separate class called Printing that will include a method called Print Details, that will print the Customer Invoice.
// In the Printing class include another method called Customer Purchase Report which will display the following information:
//REPORT OPTION PERCENTAGE
//TAX 15%
//COMMISSION 8.5%
//DISCOUNT 10%
//TOTAL (Price + Tax) – (Discount + Commission)
//
//In your main class, capture all the customer purchase details required to produce the reports.
public class Santa_Pro {
    String firstName,surname,productname;
    int quantity;
    double price,TAX,CCOMMISSSION,TOTAL_PRICE,DISCOUNT;
    Santa_Pro(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first name of the customer ");
        firstName=sc.nextLine();
        System.out.println("enter the surname of the customer ");
        surname=sc.nextLine();
        System.out.println("enter the productname");
        productname=sc.nextLine();
        System.out.println("enter the price of the product ");
        price=sc.nextInt();
        System.out.println("entere the quntity of the product ");
        quantity=sc.nextInt();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.println("This is  first name="+firstName);
        System.out.println("this is  user name ="+surname);
        System.out.println("this is roductname"+productname);
        System.out.println("this is  quntity"+quantity);
        System.out.println("this is price  "+price);
    }
    public void show(){
        TAX=0.15*price;
         CCOMMISSSION=0.085/100*price;
         DISCOUNT=0.10*price;
         TOTAL_PRICE=(price+TAX)-(DISCOUNT+CCOMMISSSION);
        System.out.println("Tis is the Tax"+TAX);
        System.out.println("This the Commission"+CCOMMISSSION);
        System.out.println("This is the discount"+DISCOUNT);
        System.out.println("Total price "+price);
    }

    public static void main(String[] args) {
        Santa_Pro obj=new Santa_Pro();
        obj.display();
        obj.show();
    }
}
