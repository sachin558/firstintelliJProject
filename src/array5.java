import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        double sum=0;
        int arr[]=new int[5];
        System.out.println("Enter the number: ");
        for(int i=0;i<5;i++){
            arr[i]=sca.nextInt();
        }
        for(int i=0;i<5;i++) {
         sum+=arr[i];
        }
        System.out.println("Average "+sum/5);
    }
}
