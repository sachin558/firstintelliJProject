import java.util.Scanner;

/*
Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join.     (use of join method and thread control mechanism)
 */
public class Threadingassingmentq3 implements Runnable{
    static int a=20;
    public void run() {
        try {
            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Threadingassingmentq3 obj=new Threadingassingmentq3();
        Threadingassingmentq3 obj1=new Threadingassingmentq3();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
        try {
            t1.join(1000);
            for (int i = 0; i < a; i++) {
                if(i%2!=0){
                    System.out.println(i);
                }

            }
        }catch (Exception o){
            System.out.println(o);
        }
    }
}
