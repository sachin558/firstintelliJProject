/*
Anonumous class
abstract modifiers
interface modifiers
if you do not know the definetion  / behaviour then we will creat abstrac method

*/
  abstract class First{
 abstract  public void method1();
}
class  Second extends  First{

    @Override
    public void method1() {
        System.out.println("welcome ");

    }
}
/* interface i1{
    void M1();
    public void M2();
    abstract  void M3();
    public  static  final int a=80;
}
*/

public class Result {

    public static void main(String[] args) {
        Second obj=new Second();  //this used for abstract modifier for creating a object of Second claas
        obj.method1();

    }

}
