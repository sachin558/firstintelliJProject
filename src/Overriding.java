public class Overriding {
    void Test(){
        System.out.println("ok");
    }
}
class Demo78 extends Overriding{
    @Override
    void Test() {
        System.out.println("sachin");
    }

    public static void main(String[] args) {
        Demo78 obj=new Demo78();
        obj.Test();
    }
}

