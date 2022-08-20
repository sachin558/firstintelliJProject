import java.util.Scanner;

public class Treehight {
    static Scanner sc=null;
    static Node Creation(){
        Node root=null;
        sc=new Scanner(System.in);
        System.out.println("entere the data");
        int data=sc.nextInt();
        if (data==-1) return null;
        root=new Node(data);
        System.out.println("enter  the left"+data);
        root.leaft=Creation();
        System.out.println("enter  the right"+data);
        root.right=Creation();
        return root;
    }
    static int  display( Node root){
        if (root==null) return 0;
        return Math.max(display(root.leaft),display(root.right))+1;
    }
   static class Node {
       int data;
       Node leaft,right;
       Node(int data){
           this.data=data;
       }
   }

    public static void main(String[] args) {
        Node root=Creation();
        System.out.println(display(root));
    }
}


