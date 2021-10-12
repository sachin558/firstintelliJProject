/*
. Create an int array of size 5, initialize it with values(10,20,30,40,50). Create a public boolean search(int arr[],
int search_element) this method will return true if the search element is present in the array
 else it will  print a message "element not found"
 */
import java.util.Scanner;

public class Arrray {
    int arr[];
    int fide;
    boolean check;
    Arrray(){
        int []arr={10,20,30,40,50};
        System.out.println("entre the number and find the number is present or not ");
        Scanner sc=new Scanner(System.in);
        fide= sc.nextInt();
    }
    public void display(){
        for(int i:arr){
            if (i==fide){
                check=true;
                break;
            }
            if (check){
                System.out.println("True "+"number is present ");
            }
            else {
                System.out.println("flase"+"number is not present ");
            }
        }
        }

    public static void main(String[] args) {
        Arrray obj=new Arrray();
        obj.display();
    }
    }

