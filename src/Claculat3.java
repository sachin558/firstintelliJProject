import java.util.Scanner;
/*
Q8. Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
*/
public class Claculat3 {
    int num1;
    int num2;
    Claculat3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the first  number  ");
        num1= sc.nextInt();
        System.out.println("entre the second number  ");
        num2= sc.nextInt();
    }
    public  double powerInt(
            int num1,int num2){
        return Math.pow(num1,num2);
    }
    public  double powerDouble(
            int num1,int num2) {
        return Math.pow(num1, num2);
    }
    public void dispaly(){
        System.out.println(powerDouble(num1,num2));
        System.out.println(powerInt(num1,num2));
    }

    public static void main(String[] args) {
        Claculat3 obj=new Claculat3();
        obj.dispaly();
    }
}
