import java.util.*;

public class user {
    public static void main(String args[]){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number first ");
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>y)
        {
            System.out.println("x is greater then y x="+" "+x);
        }
        else
        {
            System.out.println("y greater then x y="+" "+y);
        }

    }
}
