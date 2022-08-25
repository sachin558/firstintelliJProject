import java.awt.*;
import java.io.IOException;

 public class MethodeOverrdinException {
     void display() throws Exception{
         System.out.println("here ArithmeticException ");
    }
}
class Methode3 extends MethodeOverrdinException{
     void display()throws Exception{
         System.out.println("here Exception");
     }

    public static void main(String[] args) {
         Methode3 obj=new Methode3();
         try {
             obj.display();
         }catch (Exception e){

         }
    }
}
