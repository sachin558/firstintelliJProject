////Q3) Write a program to accept gender ("Male" or "Female") and age from command line arguments and
//// print the percentage of interest based on the given conditions.
////
////If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
////
////If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
////
////If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
////
////If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%
//import java.util.*;
import java.util.*;
public class gender {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the gender in capital letter");
        String gen=sc.nextLine();
        System.out.println("enter the age in decimal");
        int age=sc.nextInt();
        if (age<=1 && age>=58)
        {
           age='f';
        }
        else if (age<58 && age>=100){
            age='k';
        }
        System.out.println(age);
    }
}
