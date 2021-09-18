/// create a new class called Calculator with the following methods:
////1. A static method called powerInt(int num1,int num2)
////This method should return num1 to the power num2.
////2. A static method called powerDouble(double num1,int num2).
////This method should return num1 to the power num2.
////3. Invoke both the methods and test the functionalities.
////Hint: Use Math.pow(double,double) to calculate the power
import java.lang.*;
class Calculater{
    static double  PowerInt(int num1,int num2){
        return Math.pow(num1,num2);
    }
    static double PowerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
}
public class Calcu {
    public static void main(String[] args) {
        Calculater obj=new Calculater();
//        obj.PowerInt();
//        obj.PowerDouble(2.0,3.0);
        System.out.println(obj.PowerInt(2,2));
        System.out.println(obj.PowerDouble(4.0,3.0));
    }

}
