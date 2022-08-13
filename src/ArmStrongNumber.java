import javax.swing.*;
import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int no=153; int t=no;
        int l=0;
        while (t!=0){
            l=l+1;
            t=t/10;
        }
        int t1=no;
        int arm=0;
        int rem;
        while (t1!=0){
            int mul=1;
            rem=t1%10;
            for (int i = 1; i <=l ; i++) {
                mul=mul*rem;
            }
            arm=arm+mul;
            t1=t1/10;
        }
        if (arm==no) {
            System.out.println("this is the Armstrong number "+arm);
        }else{
            System.out.println("no");
        }
    }
}
