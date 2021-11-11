import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        int a,b,result;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numerator and Denominator");
        try{
            a=s.nextInt();    //InputMismatchException may occur
            b=s.nextInt();  //InputMismatchException may occur
            result=a/b;     //ArithmeticException may occur
            System.out.println("Result:"+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException u )
        {
            System.out.println("Only  deacimal  numbers are accepted");
        }//End of catch
    }//End main

}
