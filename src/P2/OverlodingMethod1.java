package P2;

public class OverlodingMethod1 {
    public static void main(String[] args) {
        OverlodingMethod obj=new OverlodingMethod();
        OverlodingMethod obj1=new OverlodingMethod();
        OverlodingMethod obj2=new OverlodingMethod();
        obj.M1();
        obj1.M1(10);
        obj2.M1(20,60);
        obj.show();
        obj1.show();
        obj2.show();
    }
}
