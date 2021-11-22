public class WarpperClass1 {
    public static void main(String[] args) {
        Integer obj=Integer.valueOf(90);//boxing
        Integer obj1=Integer.valueOf(90);// boxing
        System.out.println(obj.equals(obj1));//
        System.out.println(obj==obj1);
        WarpperClass1 obj3=new WarpperClass1();
        WarpperClass1 obj4=new WarpperClass1();
        System.out.println(obj3==obj4);
    }
}
