// java code to find nth node from last
public class Last_N_Node {
    public static void main(String[] args) {
        Last_N_Node obj = new Last_N_Node();
        obj.insertNode(12);
        obj.insertNode(111);
        obj.insertNode(121);
        obj.insertNode(1221);
        obj.insertNode(1322);
        obj.insertNode(1221);
        obj.printNode();

        obj.last_Nth_Node(4);

    }

    public void last_Nth_Node(int place) {
        Node mainPtr = head;
        int count = 0;
        while (count < place) {
            mainPtr = mainPtr.next;
            count++;
        }


        Node backPtr = head;
        while (mainPtr != null) {
            mainPtr = mainPtr.next;
            backPtr = backPtr.next;
        }

        System.out.println("the last "+place+ " Node value is "+backPtr.data );

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
