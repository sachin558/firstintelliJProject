// this is the multiple inheretance
package P2;

class one{

}
class two extends one{

}
class three extends two{

}
public class Output {
    public static void M1(one obj){
        System.out.println("ok");
    }
    public static void M1(two obj){
        System.out.println("Hello");
    }
    public static void M1(three obj){
        System.out.println("welcom");
    }

    public static void main(String[] args) {
        M1(null);

    }
}
