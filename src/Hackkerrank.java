import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Hackkerrank {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("==========================");
        for (int i = 0; i < 3; i++) {
            System.out.println("entere  the value");
            String s= obj.next();
            int a= obj.nextInt();
            System.out.printf("%-15s%0d%n",s,a);
        }
    }
}
