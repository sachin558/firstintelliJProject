import java.util.Locale;
import java.util.Scanner;

public class palntromString {
    int num;
    int num1;
    palntromString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the integere number  ");
        num= sc.nextInt();
    }
    public void display(){
        for (int i=num; i >=0 ; i--) {
            num1=num;
        }
        if (num==num1){
            System.out.println("p");
        }else {
            System.out.println("not palaintrom");
        }
    }

    public static void main(String[] args) {
        palntromString onj=new palntromString();
        onj.display();
    }
}
