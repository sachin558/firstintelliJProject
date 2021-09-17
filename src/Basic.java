class Demo {
    int a;
    String name;
    float b;

    Demo() {
        a = 10;
        name = "sachin";
        b = 1;
    }

    public void display() {
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);

    }
}

public class Basic {
    public static void main(String[] args) {
     Demo obj=new Demo() ;
     obj.display();
    }
}
