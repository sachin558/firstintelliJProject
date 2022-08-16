import java.util.Scanner;

public class PracticQustion {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("entre the number ");
        String str= obj.nextLine();
        try {
            int a=Integer.parseInt(str);
            System.out.println("This is the squre "+a*a);
            System.out.println("The work has been done succefulley");
        }catch (NumberFormatException e){
            System.out.println("Entered input is not a valid format for an integer"+e);
        }
    }
}
