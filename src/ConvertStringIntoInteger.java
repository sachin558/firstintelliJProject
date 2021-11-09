/*
we take the input from the user in the form of the string number and convert  into integr
 */



import java.util.Scanner;

public class ConvertStringIntoInteger {
    String i;
    ConvertStringIntoInteger(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer the  number in the form of string");
        i=sc.nextLine();
        int  res=Integer.parseInt(i);
        System.out.println(res);
    }

    public static void main(String[] args) {
        ConvertStringIntoInteger obj=new ConvertStringIntoInteger();
    }
}
