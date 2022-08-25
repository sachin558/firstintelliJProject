import java.util.Scanner;

public class findpartionsubstring {
    String str;
    findpartionsubstring(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string and find  the partition of the string ");
        str=sc.nextLine();
    }
    public static void partition(String str,int index,String out){
        if (index==str.length())
            System.out.println(out);
        for (int i = 0; i < str.length(); i++) {
            partition(str, i+1,out +"("+str.substring(index,i+1)+")");
        }
    }

    public static void main(String[] args) {
        findpartionsubstring sc=new findpartionsubstring();
        String str="nitin";int index=0; String out="";
        partition(str,index,out);
    }
}
