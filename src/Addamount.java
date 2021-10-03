import java.util.Scanner;

/*
Q6. Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it.
Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50.
 Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.

*/
public class Addamount {
    static int amount;
    int final1;
    Addamount(){
        amount=50;
        System.out.println("this is the intial amount "+amount);
    }
    Addamount(int amount){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the amount");
        amount=50;
        int a= sc.nextInt();
        final1=amount+a;
    }
    public void display(){
        System.out.println("This is the final amount of the piggie=="+final1);
    }

    public static void main(String[] args) {
        Addamount sc=new Addamount();
        Addamount s=new Addamount(sc.amount);
        s.display();
    }
}
