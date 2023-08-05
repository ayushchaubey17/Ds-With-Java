// java code to implement singly linked list and its operation

public class Singly_LInked_list {
    public static void main(String[] args) {

        Singly_LInked_list obj = new Singly_LInked_list();
        obj.insertFirst(89);                    //output:----    89->null
        obj.insertFirst(189);                             //189->89->null
        obj.insertFirst(1893);                      //1893->189->89->null
        obj.insertLast(90);                         //1893->189->89->90->null
        obj.printList();
//        obj.deleteFirst();                                      //189->89->90->null
//        obj.printList();
//        obj.deleteLast();                                       //189->89->null
//        obj.printList();



    }

    Node head;      //head pointer is of node type

    class Node {

        int data;
        Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    // for printing the linked list
    public void printList() {
        if (head == null) {
            System.out.println(" your list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }


    // for insert first in a singly linked list
    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {             // no node available in the linked list
            head = newNode;
            return;
        }
        // having some node avauilable
        newNode.next = head;
        head = newNode;
    }


    // for insertLast in a singly linked list
    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //for delete first in a ingly linked list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }
        Node temp = head;       // we created temp node for toring what we delete
        head = head.next;
        temp.next = null;
        System.out.println("\ndeleted value is " + temp.data);


    }

    //for delete last in a singly linked list
    public void deleteLast() {
        if (head == null) {     // no node available ---> nothing to delete
            return;

        }
        if (head.next == null) {    // one node availabe
            System.out.println("deleted node is " + head.data);
            head = null;        // after deleting linked lit is empty
            return;
        }

        //having some node (more than one) ---->   need to traveese to the secondlast node
        Node temp = head;                   // starting from the first node
        while (temp.next.next != null) {        // till the second lat node
            temp = temp.next;

        }

        // after performing while loop temp points to the second last node
        System.out.println("deleted value is " + temp.next.data);
        temp.next = null;


    }

}
