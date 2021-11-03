import java.util.Scanner;
import java.util.concurrent.Callable;

//At GLA College of  Programming, the final school fees to be paid is calculated as follows.
//•	Original Fees should be greater than or equal to R50 000
//•	Minimum fixed deposit of R10 000
//•	If a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees
//•	Final total fees will also include the following
//1.	School Levy is 10% of original fees
////2.	Sports fee is 5% of the original fees.
//Write a program the calculates the final total fees to be paid.
//
//tProgram must request user to enter original fees value greaer then R50 000.
//Program should also request user to enter amount to deposit before calculating final total fees
public class CalculattheFinal {
    int Orginalfees,dipositfees,a,c;
    CalculattheFinal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Program must request user to enter original fees value greaer then R50 000 .");
        Orginalfees=sc.nextInt();
        System.out.println("deposit fees minimum  must be greater then 10000  ");
        dipositfees=sc.nextInt();
    }
    void display(){
        if(dipositfees>=(Orginalfees)/2 && dipositfees>=10000){
            a=Orginalfees*5/100+Orginalfees*10/100+Orginalfees*5/100+dipositfees;
            System.out.println("//your  a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees ="+a);
        }
        else
        {
            c=Orginalfees*10/100+Orginalfees*5/100+dipositfees;
            System.out.println("this is the final fees deposit but youn can not get 5% discount "+c);
        }
    }
    public static void main(String[] args) {
        CalculattheFinal obj=new CalculattheFinal();
        obj.display();
    }
}
