import java.nio.channels.ScatteringByteChannel;

public class ExceptionHandlingClass {
    public static void main(String[] args) {
        try {
            int a = 90;
            throw  new ArithmeticException(" yers");
            ///System.out.println(a / 0);//ArithmaticEception
        }
        catch (ArithmeticException obj) {
            System.out.println(obj);
        }
        catch (NumberFormatException obj){
            System.out.println(obj);
        }
        catch (NullPointerException onj){
            System.out.println(onj);
        }
        catch (Exception obj){
            System.out.println(obj);
        }
        }

    }

