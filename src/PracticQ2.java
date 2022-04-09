import java.util.Scanner;

public class PracticQ2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("entre the size of  the array");
        int size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("entre the elemnt of the array ");
        try {
            for (int i = 0; i < arr.length; i++)
                arr[i]=obj.nextInt();
            System.out.println("entre the access the index");
            int index=obj.nextInt();
            System.out.println("This is the given index ="+index+"  "+arr[index]);
            System.out.println("The array element successfully accessed");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
