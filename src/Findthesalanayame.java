import java .util.Scanner;
public class Findthesalanayame {
    String name ;
    String c_nmae;
    int id;
    int sal;
    Findthesalanayame(String a,String b,int c,int d){
        name=a;
        c_nmae=b;
        id=c;
        sal=d;
    }
      public static void result(Findthesalanayame tarr[]){
        int max=Integer.MIN_VALUE;
        int Aindex=0;
        for (int i = 0; i <tarr.length ; i++) {
            if(tarr[i].sal>max)
               max=tarr[i].sal;
        }
        System.out.println("The Employee name"+"this is the hights salary in the given by user "+max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many create the object ");
        int a=sc.nextInt();
        Findthesalanayame arr[]=new Findthesalanayame[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the entere the employee naem and campanynaem,id and salary");
            arr[i]=new Findthesalanayame(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        Findthesalanayame.result(arr);
    }
}
