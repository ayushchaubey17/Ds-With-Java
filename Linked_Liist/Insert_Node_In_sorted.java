
// java code to Insert a NODE IN A Sorted linked list
public class Insert_Node_In_sorted {
    public static void main(String[] args) {

        Insert_Node_In_sorted obj = new Insert_Node_In_sorted();
        obj.insertNode(9);
        obj.insertNode(6);
        obj.insertNode(5);
        obj.insertNode(5);
        obj.insertNode(5);
        obj.insertNode(4);
        obj.insertNode(3);
        obj.insertNode(2);
        obj.insertNode(1);
        obj.insertNode(1);
        obj.insertNode(1);
        obj.insertNode(1);
        obj.printNode();                                    //1-->1-->1-->1-->2-->3-->4-->5-->5-->5-->6-->9-->null
        // we have created a sorted linked list

        obj.Insert_Node(8);
        obj.printNode();                                    //1-->1-->1-->1-->2-->3-->4-->5-->5-->5-->6-->8-->9-->null

    }


    public void Insert_Node(int value) {
        Node newNode = new Node(value);
        Node current = head;
        Node temp = head;
        while (current != null && current.data < value) {
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;


    }


    // this code is used  for creating the list

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
