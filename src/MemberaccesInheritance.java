import java.util.Scanner;

public class MemberaccesInheritance {
    int a,b,c,sum=0;
    MemberaccesInheritance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the value of a ");
        a= sc.nextInt();
        System.out.println(System.in);
        b= sc.nextInt();
    }

    public void sachin(){
        c=a+b;
    }

    public void sachin1(){
        if (a>b)
        {
            System.out.println("This number is greatr then b "+a);
        }
        else {
            System.out.println("Tnhis number is less then  a "+b);
        }
    }

    class sadch extends MemberaccesInheritance{
        public void sach(){
            for (int i = 0; i < a; i++) {
                sum+=i;

            }
            System.out.println("This is the sum of the given number "+sum);
        }
    }

    public static void main(String[] args) {
        MemberaccesInheritance obj=new MemberaccesInheritance();
        Scanner sc=new Scanner(System.in);
        obj.sachin();
        obj.sachin1();
    }
}
