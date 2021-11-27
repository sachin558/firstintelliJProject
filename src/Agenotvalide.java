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
            name= obj.nextLine();
            System.out.println("entre teh age of the person ");
            age=Integer.parseInt(obj.nextLine());
            if(age>=18 && age<60){
                System.out.println("name of the person "+name);
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
