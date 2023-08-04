// java code to implement singly linked list and its operation

public class Singly_LInked_list {
    public static void main(String[] args) {
        Singly_LInked_list obj = new Singly_LInked_list();
        obj.insertFirst(89);
        obj.insertFirst(189);
        obj.insertFirst(1893);
        obj.insertLast(90);
        obj.printList();
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
        if (head == null) {
            head = newNode;
            return;
        }
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

}
