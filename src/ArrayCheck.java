import java.util.Scanner;
public class ArrayCheck {
    int []arr;
    int find;
    ArrayCheck(){
        int []arr={1,54,9,8,7};
        System.out.println("entre the finding the number ");
        Scanner sc=new Scanner(System.in);
        find= sc.nextInt();
        boolean check=false;
        for (int i:arr){
            if(i==find){
                check=true;
                break;
            }

        }
        if (check){
            System.out.println(find+"  "+"this number is present in the given array");
        }
        else {
            System.out.println(find+" "+"not found the given number");
        }

    }

    public static void main(String[] args) {

        ArrayCheck obj=new ArrayCheck();
    }
}
