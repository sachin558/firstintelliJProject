import java.util.Scanner;

public class ExpetionFinallbolck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int arr[]={23,34,5,3,234};
                int index=sc.nextInt();
                System.out.println(a/b);
                System.out.println(arr[index]);
            }
        }
        catch ( Exception obj){
            System.out.println(obj);
        }
        finally {
            System.out.println("this is the fanally block");
        }
    }
}
