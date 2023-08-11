// java code to remove loop...in a singly linked list
public class Remove_Loop {

    public static void main(String[] args) {
        Remove_Loop obj = new Remove_Loop();
        obj.insertNode(12);
        obj.insertNode(13);
        obj.insertNode(14);
        obj.insertNode(15);
        obj.insertNode(153);
        obj.insertNode(125);
        obj.insertNode(152);
        obj.insertNode(16);
        obj.printNode();            //16-->152-->125-->153-->15-->14-->13-->12-->null

        obj.MakeLoop();         // Loop is created
//        obj.printNode();
        obj.checkingLoop();     // Loop is removed
        obj.printNode();


    }

    // this is for checking starting node of the loop
    public int RemoveLoop(Node slowptr) {
        Node tempo = head;
        while (tempo.next != slowptr.next) {
            tempo = tempo.next;
            slowptr = slowptr.next;
        }
//        slowptr  reaches just one before the starting point of the loop
        slowptr.next = null;          // for breaking loop
        System.out.println("loop is removed...");
        return 0;
    }

    //this method is used for cheecking loop or not
    // method call to another for first node
    public void checkingLoop() {
        Node slowPtr = head;        // ONE STEPS AT A TIME
        Node FastPtr = head;        // TWO STEPS AT A TIME

        while (FastPtr != null && FastPtr.next != null) {
            FastPtr = FastPtr.next.next;
            slowPtr = slowPtr.next;


            if (slowPtr == FastPtr) {   //IF FAST CATCH SLOW LOOP PRESENT
                System.out.println("there is a loop");
                RemoveLoop(slowPtr);
                return;

            }

        }
    }


    // method for creating the loop
    public void MakeLoop() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        // now tail points the last node
        tail.next = head.next.next.next;

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
