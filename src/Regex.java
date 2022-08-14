import java.util.Scanner;

public class Regex {
    String str;String str2;
//    Regex(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the first string ");
//        str=sc.nextLine();
//        System.out.println("enter the second string ");
//    }
    public boolean display(String str , String str1){
        boolean bool=str.matches(str1);
        return bool;
    }

    public static void main(String[] args) {
        Regex obj=new Regex();
        System.out.println(obj.display("sss","sss"));
    }
}
