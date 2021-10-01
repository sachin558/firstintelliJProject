import java.util.Scanner;
 abstract class ST {
     int a;
     int b;
     int c;
     public ST() {
         Scanner sc = new Scanner(System.in);
         System.out.println("entre the first number ");
         a = sc.nextInt();
         System.out.println("entre the second number");
         b = sc.nextInt();
     }
     /*public void display() {
         c = a;
         a = b;
         b = c;
         System.out.println(a + " " + b);
     }
     */
     abstract public void greek();
 }
class Set extends ST{
     public void greek(){
         c = a;
         a = b;
         b = c;
         System.out.println(a + " " + b);
     }
}
public class UsingConsMethod {
    public static void main(String[] args) {
        Set  obj=new Set();
       // obj.display();
        obj.greek();
    }
}
