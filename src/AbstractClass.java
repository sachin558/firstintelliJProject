abstract class AbstractClass {
    abstract  void run();
}
class sachin extends AbstractClass{
    void run()
    {
        System.out.println("This is the abstract method call in subclass ");
    }

    public static void main(String[] args) {
        sachin obj=new sachin();
        obj.run();
    }
}
