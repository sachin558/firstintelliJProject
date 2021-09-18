import java.util.*;
public class sumofnaturalnumber {
    public static void main(String[] args) {
        int n ,i=1,sum=0;
        System.out.println("enter the nutural number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=n)
        {
           sum+=i;
           i+=1;
            System.out.println("sum of the given number"+" "+sum);
        }
    }
}
