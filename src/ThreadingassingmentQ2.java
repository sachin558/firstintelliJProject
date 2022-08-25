import java.util.Random;

/*
store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface
 */
public class ThreadingassingmentQ2 implements Runnable{
    String colurs[]={"white","blue","black","green","red","yellow"};
    public void run(){
        for (int i = 0; i < colurs.length; i++) {
            if(colurs[i]=="red"){
                break;
            }
            System.out.println(colurs[i]);
        }
    }

    public static void main(String[] args) {
        ThreadingassingmentQ2 obj=new ThreadingassingmentQ2();
        Thread obj1=new Thread(obj);
        obj1.start();

    }
}
