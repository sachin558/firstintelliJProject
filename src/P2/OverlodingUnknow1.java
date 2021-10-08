package P2;

public class OverlodingUnknow1 {
    public static void main(String[] args) {
        OverlodingUnknow obj=new OverlodingUnknow();
        OverlodingUnknow obj1=new OverlodingUnknow();
        OverlodingUnknow obj2=new OverlodingUnknow();
        obj.Setvalue(20,"sachin");
        obj1.Setvalue(30,"yadav",90);
        obj.show();
        obj1.show();
        obj2.show();
    }
}
