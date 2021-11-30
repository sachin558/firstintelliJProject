public class ThreadByStringpass {
    public static void main(String[] args) {
        Thread obj=new Thread("ThreadByStringpass");
        obj.start();
        String s=obj.getName();
        System.out.println(s);
    }
}
