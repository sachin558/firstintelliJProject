public class ReturnObject {
    int a;
    ReturnObject(int i){
        a=i;
    }
    ReturnObject incr(){
        ReturnObject Temp=new ReturnObject(a+10);
        return  Temp;
    }

    public static void main(String[] args) {
        ReturnObject obj=new ReturnObject(2);
        ReturnObject obj1;
        obj1=obj.incr();
        System.out.println("obj.a:"+obj.a);
        System.out.println("obj.a"+obj1.a);
        obj1=obj1.incr();
        System.out.println("object of the second increase the "+obj1.a);
    }
}
