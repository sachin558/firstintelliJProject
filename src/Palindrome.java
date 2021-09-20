//Q1. write a Java program to find if the given number is palindrome or not
//
//Example1)
//C:\>java Sample 110011
//O/P: 110011 is a palindrome
//
//Example2)
//C:\>java Sample 1234
//O/P: 1234 is not a palindrome
import java.util.*;
public class Palindrome {
    int num;
    int sum=0;
    int re;
    int te;
    Palindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the number and check the number is palindrom or not ");
        num=sc.nextInt();
        te=num;
    }
    void display(){
        while (num>0){
            re=num%10;
            sum=(sum*10)+re;
            num=num/10;
        }
        if (te==sum){
            System.out.println(te+" is palindrom number ");
        }
        else{
            System.out.println(te +" is not a palindrom number ");
        }
    }

    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.display();
    }


}
