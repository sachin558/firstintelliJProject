import java.util.Scanner;

public class GCD {
    int num1,num2;
    GCD(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ente  the first number  ");
        num1=sc.nextInt();
        System.out.println("enter  the second numebr ");
        num2=sc.nextInt();
    }
    public void  display(){
        while (num1!=num2){
            if (num1>num2){
                num1-=num2;
            }else {
                num2-=num1;
            }
        }
        System.out.println(num1+" " +"this is the gcd");
    }

    public static void main(String[] args) {
        GCD obj=new GCD();
        obj.display();
    }
}
