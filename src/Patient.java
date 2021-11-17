import java.util.Scanner;

public class Patient {
    String patientname;
    double hight;
    double width;
    Patient(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the  name of the patient ");
        patientname=sc.nextLine();
        System.out.println("enter the hight");
        hight=sc.nextInt();
        System.out.println("entre the width");
        width=sc.nextInt();
    }
    double computeBMI(){
        return width/(hight*hight);
    }

    public static void main(String[] args) {
        Patient obj=new Patient();
        obj.computeBMI();
        System.out.println(obj.computeBMI());
    }
}
