// java code for finding the starting node of a linked list
public class Starting_of_Loop {

    public static void main(String[] args) {
        Starting_of_Loop obj = new Starting_of_Loop();
        obj.insertNode(12);
        obj.insertNode(13);
        obj.insertNode(14);
        obj.insertNode(15);
        obj.insertNode(153);
        obj.insertNode(125);
        obj.insertNode(152);
        obj.insertNode(16);
        obj.printNode();            //16-->152-->125-->153-->15-->14-->13-->12-->null

//        obj.MakeLoop();         // Loop is created

//  After creating the loop
//        obj.printNode();      //16-->152-->125-->153-->15-->14-->13-->12-->153-->15-->14-->13-->12-->153.........
        int k = obj.checkingLoop();
        if (k == 0) {


            System.out.println(" loop not present");
            return;
        }
        System.out.println(" loop starts at node having value" + k);

    }


    //this method is used for cheecking loop or not
    // method call to another for first node
    public int checkingLoop() {
        Node slowPtr = head;        // ONE STEPS AT A TIME
        Node FastPtr = head;        // TWO STEPS AT A TIME

        while (FastPtr != null && FastPtr.next != null) {
            FastPtr = FastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == FastPtr) {   //IF FAST CATCH SLOW LOOP PRESENT
                System.out.println("there is a loop");
                return loopStartAt(slowPtr);
            }

        }
        return 0;

    }


    // this is for
    public int loopStartAt(Node slowptr) {
        Node temp = head;
        while (temp != slowptr) {
            temp = temp.next;
            slowptr = slowptr.next;
        }
        if (slowptr == temp) {
            return slowptr.data;

        }

        return 0;
    }


    // method for creating the loop
    public void MakeLoop() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // now tail points the last node
        tail.next = head.next.next;

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
