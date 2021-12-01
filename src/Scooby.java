/*
Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.
 */
public class Scooby extends Thread{
    public void run(){
        System.out.println("Scooby");
    }
}
class Shogy extends Thread{
    public void run(){
        System.out.println("shogy");
    }

    public static void main(String[] args) {
      Scooby  obj=new Scooby();
      obj.start();
      Shogy obj1=new Shogy();
      obj1.start();

    }
}

