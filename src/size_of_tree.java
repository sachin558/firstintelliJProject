import java.util.Scanner;

public class size_of_tree {
    static Scanner sc = null;

    public static void main(String[] args) {
        Node root=create();
        System.out.println( sizeof(root));
    }
        public static Node create () {
            Node root = null;
            sc = new Scanner(System.in);
            System.out.println("enter   the data");
            int data = sc.nextInt();
            if (data==-1) return null;
            root=new Node(data);
            System.out.println("enter the left  data" + data);
            root.left = create();
            System.out.println("enter  the right data" + data);
            root.right = create();
            return root;
        }
        public static int sizeof (Node root){
            if (root == null) {
                return 0;
            }
            return sizeof(root.left) + sizeof(root.right) + 1;
        }
    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }


