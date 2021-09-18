public class Out {
        int []Ia=new int[1];
        boolean b;
        int I;
        Object o;

    public static void main(String[] args) {
        Out obj=new Out();
        obj.print();
    }
    public void print(){
        System.out.println(Ia[0]+" "+b+" "+I+" "+o);
    }
}
