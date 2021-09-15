// To find the maximum number given by two value
import java.util.*;
public class maxnumber {
    public static void main (String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        if (a>b)
        {
            System.out.println("a is greater then b  a= "+ ""+a);
        }
        else
        {
            System.out.println("b is greater then a  b="+" "+b);
        }
    }

}
