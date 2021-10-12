/*
This is the  single level inheretance
 */

public class SingleLevealInheretance {
    int a;
    int b;
}
class Test4 extends SingleLevealInheretance{
    int c=80;
    int d=90;
public void M5(){
    System.out.println(c+" "+d);
}
    public static void main(String[] args) {
        Test4 obj=new Test4();
        obj.M5();

    }
}
