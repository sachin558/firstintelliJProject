abstract class Abstract1 {
    abstract void sachin();
}
class  sachin1 extends Abstract1{
    @Override
    void sachin() {
        System.out.println("Thios is the  abstrac class ");
    }

    public static void main(String[] args) {
        sachin1 obj=new sachin1();
        obj.sachin();
    }
}
