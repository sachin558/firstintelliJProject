public class construter {
    int a;
    float b;
    double vol;
    construter(){
        System.out.println("construter Box");
        a=10;
        b=30;
    }
}
class demo{
    public static void main (String []args){
        construter obj1=new construter();
        construter obj2=new construter();
        construter obj3=new construter();
    }
}
