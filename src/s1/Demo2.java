package s1;

import java.util.Scanner;

public class Demo2 {
    public  int a;
    public  int b;
    public Demo2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number and fint ");
        a= sc.nextInt();
    }
    public void display(){
        if (a%2==0){
            System.out.println("This number is the even  number");
        }
        else {
            System.out.println("This number is odd ");
        }
    }
}
