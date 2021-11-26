import java.util.Scanner;
public class Agenotvalide extends Throwable {
    Agenotvalide(){
        super();
    }
}

class UserException{
    public static void main(String[] args) {
        String name;
        int age;
        Scanner obj=new Scanner(System.in);
        System.out.println("entre the command line argument ");
        try {
            System.out.println("name of the person "+args[0]);
            age=Integer.parseInt(args[1]);
            if(age>=18 && age<60){
                System.out.println("this is the age of the person "+age );
            }
            else {
                throw new Agenotvalide();
            }
        }catch (Agenotvalide o){
            System.out.println(o);
        }

    }

}
