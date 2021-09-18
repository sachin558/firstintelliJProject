class BOX{
    int hight;
    float width;
    int depeth;
     double Set(){
         return hight*width*depeth;
    }
    BOX(int a,float b,int c){
         hight=a;
         width=b;
         depeth=c;
    }
}
public class Boxdemo {
    public static void main(String[] args) {
        BOX obj=new BOX(12,23,45);
        BOX obj1=new BOX(23,45,6);
        obj.Set();
        obj1.Set();
        System.out.println("this is the value of the given number "+" "+obj.Set());
        System.out.println("entr erjt e"+" "+obj1.Set());
    }

}
