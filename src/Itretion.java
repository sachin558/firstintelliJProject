//Q3) Write a program to accept gender ("Male" or "Female") and age from command line
// arguments and print the percentage of interest based on the given conditions.
//
//If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
//
//If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
//
//If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
//
//If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
import java .util.*;
public class Itretion {
    int age;
    String gen;
    Itretion(){

        Scanner sc=new Scanner(System.in);
        System.out.println("entre the gender ");
        gen=sc.nextLine();
        System.out.println("entre the age ");
        age=sc.nextInt();
    }
    void display(){
        if (age>=1 && age<=58){
            System.out.println("intrest 5.2%");
        }
        else
        {
            System.out.println("intrest 8.9%");
        }
    }
    public static void main(String args[]){
        Itretion obj=new Itretion();
        obj.display();
    }
}
