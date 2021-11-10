/*
java  Test 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
 */
package assingenment2;
import java.util.Scanner;
public class ConverIntTohexAndOctal {
    int i;
    String b,o,h;
    ConverIntTohexAndOctal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer the intger number ");
        i= sc.nextInt();
    }
    void display(){
        b=Integer.toBinaryString(i);
        o=Integer.toOctalString(i);
        h=Integer.toHexString(i);
        System.out.println("java Test  "+i);
        System.out.println("Given number "+i);
        System.out.println("Binary  equivalent : "+b);
        System.out.println("Octal  equivalent : "+o);
        System.out.println("hexdecimal  equivalent : "+h);
    }

    public static void main(String[] args) {
        ConverIntTohexAndOctal obj=new ConverIntTohexAndOctal();
        obj.display();
    }
}
