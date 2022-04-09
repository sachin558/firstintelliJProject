import java.util.Scanner;

public class Practice extends Exception {
    public Practice(String b){
        super(b);
    }
}
 class Exam extends Exception{
    public Exam(String n){
        super(n);
    }
}
class Test0{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("entre the age ");
        int a=obj.nextInt();
        try {
            if(a>18){
                System.out.println(a);
                throw new Practice("you are elegibel for voit ");
            }
            else {
              throw new Exam("you are not elegible for Exam");
            }
        }catch (Practice o){
            System.out.println(o);
        }catch (Exam i){
            System.out.println(i);
        }
    }
}
