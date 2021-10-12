interface  Interface {
    void  sachin();
}
interface sachi{
    void sa();
}
class a1 implements Interface,sachi{
    @Override
    public void sachin() {
        System.out.println("this the frist interface class ");
    }

    @Override
    public void sa() {
        System.out.println("this the second intreface class ");
    }

    public static void main(String[] args) {
        a1 obj=new a1();
        obj.sachin();
        obj.sa();
    }
}

