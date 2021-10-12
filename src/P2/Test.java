package P2;

public class Test {
    public static void main(String[] args) {
        Exam obj=new Exam();
        Exam obj1=new Exam(20);
        Exam obj2=new Exam(30,"LLB",70);
        obj.display();
        obj1.display();;
        obj2.display();
    }
}
