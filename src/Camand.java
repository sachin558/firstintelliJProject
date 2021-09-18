//Q4) Write a Program that accepts two Strings as command line arguments and generate
// the output in the required format.
//
//Example1)
//If the two command line arguments are GLA and Mathura then the output generated should be GLA University Mathura.
//
//Example2)
//If the command line arguments are AAA and Delhi then the output generated should be AAA Technologies Delhi
//
//[Note: It is mandatory to pass two arguments in command line]

import java.util.*;
public class Camand {
    String name;
    String name2;
    Camand()
    {    name=" GLA and Mathura";
         Scanner sc=new Scanner(System.in);
        System.out.println("enetr the condition first");
        name2=sc.nextLine();

    }
    void display(){
        if (name==name2);
        {
            System.out.println(" GLA University Mathura. ");
        }
    }
    public static void main(String args[]){
        Camand obj=new Camand();
        obj.display();
    }
}
