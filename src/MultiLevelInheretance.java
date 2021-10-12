/*
This is the multilevel inheretance
 */
public class MultiLevelInheretance {
    int age;
    String name;
}
 class Test5 extends MemberaccesInheritance{
    int a;
    String sub;
}
class Test6 extends Test5{
    int section;
    public void display(){
        System.out.println(a+" "+sub+" "+section);
    }

    public static void main(String[] args) {
        Test6 obj=new Test6();
        obj.display();
    }
}
