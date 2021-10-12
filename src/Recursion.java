public class Recursion {
    int fact(int n){
        int result;
        if (n==1) return 1;
        result=fact(n-1)*n;
        return result;
    }

    public static void main(String[] args) {
        Recursion obj=new Recursion();
        System.out.println("factorial of the  3"+obj.fact(5));
    }
}
