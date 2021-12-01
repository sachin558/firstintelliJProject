/*
Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time.
 Observe the completion of the threads. (Thread priorities concept)
 */
public class ThreadongassigmentQu5 implements Runnable{
    public static void main(String[] args) {
        ThreadongassigmentQu5 obj=new ThreadongassigmentQu5();
        ThreadongassigmentQu5 obj1=new ThreadongassigmentQu5();
        ThreadongassigmentQu5 obj2=new ThreadongassigmentQu5();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        Thread t3=new Thread(obj2);
    }
    public void run(){

    }
}
