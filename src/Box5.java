import java.lang.*;

class Box {
    int hight;
    int width;
    int depth;
    Box(){
        hight=13;
        width=90;
        depth=89;
    }
    double vol(){
        return hight*width*depth;
    }
}
 class Box5 {
    public static void main(String[] args) {
        Box obj=new Box();
        Box obj1=new Box();
        double volm;
        volm=obj.vol();
        volm=obj1.vol();
        System.out.println("this the first value"+" "+volm);
        System.out.println("this the second "+" "+volm);
    }
}
