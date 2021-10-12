public class Object {
    int a,b;
    //return  true if o is equal to the invoking object
    Object(int i ,int j){
        a=i;b=j;
    }
    boolean equal(Object o){
        if (o.a==a&&o.b==b) return true;
        else return false;
    }
    public static void main(String[] args) {
        Object obj=new Object(100,200);
        Object obj1=new Object(100,200);
        Object obj2=new Object(10,20);
        Object obj3=new Object(2,9);
        System.out.println("obj==obj1"+" " + obj.equal(obj1));
        System.out.println("obj2==obj3"+"  "+obj2.equal(obj3));
    }
}
