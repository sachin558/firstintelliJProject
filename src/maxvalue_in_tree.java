import java.util.Scanner;

public class maxvalue_in_tree {
   static Scanner sc=null;

    public static void main(String[] args) {
        Node root=cret();
        System.out.println(maxvalue(root));
    }
    public static Node cret(){
        sc=new Scanner(System.in);
        Node root=null;
        System.out.println("enter  the data");
        int data=sc.nextInt();
        if (data==-1) return null;
        root=new Node(data);
        System.out.println("enter the left data"+data);
        root.left=cret();
        System.out.println("enter the right data"+data);
        root.right=cret();
        return root;
    }
    public static int maxvalue(Node root){
        if (root==null) return 0;
        return Math.max(root.data,Math.max(maxvalue(root.left),maxvalue(root.right)))+1;
    }
}
