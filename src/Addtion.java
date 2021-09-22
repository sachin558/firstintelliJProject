 public class Addtion {
    int a;
    int b;
    Addtion(){
        a=90;
        b=80;
    }
    int ADD(){
        return a+b;
    }

     public static void main(String[] args) {
         Addtion obj=new Addtion();
         obj.ADD();
         System.out.println("the sum of two number a and b"+"\t"+obj.ADD());
     }
}
