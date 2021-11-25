import java.awt.desktop.ScreenSleepEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionUserIput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int arra[]={122,323,45,89};
                int index=sc.nextInt();
                System.out.println(a/b);
                System.out.println(arra[index]);
            }
        }
        catch (ArithmeticException obj ){
            System.out.println(obj);
        }
        System.out.println("en of the program ");
    }
}
