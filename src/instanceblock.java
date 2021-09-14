public class instanceblock {
    int num1;
    float num2;
    static int count;
    {
    count++;
    }
    instanceblock()
    {
        num1=20;
        num2=30;
    }
    instanceblock(int a,float b){
        num1=a;
        num2=b;
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void main (String args []){
        instanceblock obj1=new instanceblock();
        instanceblock obj2=new instanceblock(10,30);
        instanceblock obj3=new instanceblock();
       System.out.println(obj1.num1);
        System.out.println(obj2.num2);

    }
}
