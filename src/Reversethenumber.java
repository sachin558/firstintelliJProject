import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public   class Reversethenumber {
    int number;
    Reversethenumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        number=sc.nextInt();
    }
    public long display(){
        boolean isNegative=number<0;
        if(isNegative){
            number=number*-1;
        }
        int  lastdigits,revers=0;
        while (number>0){
             lastdigits=number*10;
             revers=revers*10+lastdigits;
             number/=10;
        }
        return isNegative ? revers*-1:revers;
    }

    public static void main(String[] args) {
        Reversethenumber obj=new Reversethenumber();
        System.out.println(obj.display());
    }
}
