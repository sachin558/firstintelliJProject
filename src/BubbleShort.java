import java.util.Scanner;

public class BubbleShort {
    int t,f;
    void display(){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter teh size of the array ");
        int size=obj.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("entre the element of the array ");
             arr[i]= obj.nextInt();
        for (i=0;i<size;i++){
            for (int j = 0; j < size-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    f=0;
                }
            }
            if(f==0){
                break;
            }
        }
            for ( i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }
        }

    }

    public static void main(String[] args) {
        BubbleShort obj=new BubbleShort();
        obj.display();
    }
}