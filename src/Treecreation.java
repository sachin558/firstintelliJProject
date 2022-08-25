import java.util.Scanner;

public class Treecreation {
    static Scanner sc=null;
    static int sum=0;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root= creat();
        INOrder(root);
        System.out.println();
        System.out.println(sum);
        preOrder(root);
        System.out.println();
        System.out.println(sum);
        poOrder(root);
        System.out.println();
        System.out.println(sum);

    }
    static Node creat(){
        Node root=null;
        System.out.println("Enter the data");
        int data=sc.nextInt();
        if (data==-1) return null;
        root =new Node(data);
        System.out.println("enter the leaft for "+data);
        root.left=creat();
        System.out.println("entre the right for"+data);
        root.right=creat();
        return root;
    }
    static void INOrder(Node root){
         sum=0;
        if (root==null){
            return ;
        }
        INOrder(root.left);
        System.out.println(root.data);
        INOrder(root.right);

    }
    static void preOrder(Node root){
        if (root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void  poOrder(Node root){
        if (root==null){
            return ;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");;

    }
    static class Node {
        Node left,right;
        int data;
        public Node(int data){
            this.data=data;
        }
    }
}
