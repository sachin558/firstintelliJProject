//Q2) Write a program to print the area of two rectangles having sides (4,5) and (5,8)
// respectively by creating a class named 'Rectangle' with two instance variables,
// length and breadth and a  method named 'Area' which returns the area. Initialise the object
//attributes by taking the input from the user in the constructor
//
import java.util.*;
public class Rectangular{
    int lenght;
    int breath;
    Rectangular(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer the lenght");
        lenght=sc.nextInt();
        System.out.println("enter the breath");
        breath=sc.nextInt();
    }
    int  Area(){

        return lenght*breath;
    }

    public static void main(String[] args) {
        Rectangular obj=new Rectangular();
        obj.Area();
        System.out.println(obj.Area());
    }
        }
