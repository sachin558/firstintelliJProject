import java.util.*;

public class ca {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the vaule a");
            int a=sc.nextInt();
            System.out.println("enter the vaule b");
             int b=sc.nextInt();
            System.out.println("enter the choice ");
             int ch=sc.nextInt();
             switch(ch)
             {
                 case 1:
                     System.out.println("add"+(a+b));
                     break;
                 case 2:
                     System.out.println("sub"+(a-b));
                     break;
                 case 3:
                     System.out.println("mult"+(a*b));
                     break;
                 case 4:
                     System.out.println("divided"+(a/b));
                     break;
                 default:
                     System.out.println("invalid choice");



             }


        }
}
