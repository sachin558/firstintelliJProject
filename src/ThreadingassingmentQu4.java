/*
Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6.
( Thread Control Mechanism concept)
 */
public class ThreadingassingmentQu4 implements Runnable{
    static int a=10;
    public static void main(String[] args) {
        ThreadingassingmentQu4 obj=new ThreadingassingmentQu4();
        Thread t1=new Thread(obj);
        t1.start();
    }
    public void run(){
        for (int i = 1; i <a; i++) {
            if(i==5){
                try {
                    Thread.sleep(5000);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println(i);
            }
        }
    }
}
