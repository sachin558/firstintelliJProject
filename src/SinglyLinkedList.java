public class SinglyLinkedList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
//        insert the node at beginning
        public  void  insertNode(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        public void insertAterNode(Node prev_Node,int data){
            if (prev_Node==null){
                System.out.println("previous node can not be null ");
                return;
            }
            Node newnode=new Node(data);
            newnode.next=prev_Node.next;
            prev_Node.next=newnode;
        }
        public void traversal() {
            Node curr = head;
            if (head == null) {
                System.out.println("linked list is the empty");
            }
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.insertNode(10);
        sll.insertAterNode(sll.head.next,5);
        sll.traversal();
    }
}
