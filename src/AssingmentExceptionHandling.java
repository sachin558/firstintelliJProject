/*
Handle exception in number
Problem statement:
Get the input String from user and parse it to integer,
if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer."
 or else print the square of that number. (Refer Sample Input and Output).
Sample input and output 1:
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
 */
import java.util.Scanner;

public class AssingmentExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the integer");
        String str = sc.nextLine();

        try {
           int x=Integer.parseInt(str);
            System.out.println("this is squre of the number "+x*x);
            System.out.println("The work has been done successfully");
        }
        catch (NumberFormatException u){
            System.out.println("Enter number 9is the not valid format for an integre");
        }
        sc.close();
    }
}

