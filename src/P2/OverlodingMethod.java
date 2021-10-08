package P2;

public class OverlodingMethod {
    int a;
    int b;
    public void M1(){
        a=20;
        b=30;
    }
    public void M1(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void M1(int a){
        this.a=a;
    }
    public void show(){
        System.out.println(a);
        System.out.println(b);
    }
}
