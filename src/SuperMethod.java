public class SuperMethod {
    SuperMethod(){
        System.out.println("ok");
    }
}
class Super extends SuperMethod{
    Super(){
        System.out.println("saxchin");
    }

    public static void main(String[] args) {
        Super obj=new Super();
    }
}
