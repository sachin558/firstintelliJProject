public class Heirarchical_Inheretance {
    void nm(){
        System.out.println("ok");
    }
}
class  test extends Heirarchical_Inheretance{
    void M2(){
        System.out.println("sachin");
    }
}
class test2 extends Heirarchical_Inheretance{
    void BOX(){
        System.out.println("nvjhf");
    }

    public static void main(String[] args) {
        test2 obj=new test2();
        obj.nm();
        obj.BOX();
    }
}
