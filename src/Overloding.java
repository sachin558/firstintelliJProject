class Over {
    void Test() {
        System.out.println("no paramiter pass here ");
    }

    void Test(int a) {
        System.out.println("paramitars method" +" "+ a);
    }

    void Test(int a, int b) {
        System.out.println("this is also paramitris methos with two argument"+" "+a+b);
    }
}

public class Overloding {
    public static void main(String[] args) {
        Over obj=new Over();
        obj.Test();
        obj.Test(10);
        obj.Test(45,89);
    }
}
