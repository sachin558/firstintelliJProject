import java.util.Scanner;

public class ConvertIntegertoBinary {
    int i;
    ConvertIntegertoBinary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the integer value  between 1 to 255");
        i=sc.nextInt();
        String re=Integer.toOctalString(i);
        System.out.println("this the integer number"+" = "+i+" and this is the octal equvelent of the given number "+" = "+re);
    }

    public static void main(String[] args) {
        ConvertIntegertoBinary obj=new ConvertIntegertoBinary();
    }
}
