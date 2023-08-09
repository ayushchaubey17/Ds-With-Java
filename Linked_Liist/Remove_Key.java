// java code to remove a key from the linked list
public class Remove_Key {
    public static void main(String[] args) {
        Remove_Key obj = new Remove_Key();
        obj.insertNode(12);
        obj.insertNode(13);
        obj.insertNode(14);
        obj.insertNode(16);
        obj.insertNode(15);
        obj.printNode();                    //15-->16-->14-->13-->12-->null

        obj.deleteKey2(15);
//        obj.deleteKey1(15);
        obj.printNode();                    //16-->14-->13-->12-->null


    }


    // this method is by using two pointer
    public void deleteKey2(int key) {
        Node current = head;
        Node temp = null;


        // for the corner case...
        if (head.data == key) {
            head = head.next;
            return;
        }

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("element not found");
            return;
        }


        temp.next = current.next;

    }


    // this method is by using one pointer
    // method declaration for deleting
    public void deleteKey(int key) {
        // if the node that should be deleted is firt then
        if (head.data == key) {
            head = head.next;
            return;
        }


        //for node not first
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;

        }

//        if element unavailable
        if (current.next == null) {
            System.out.println("element not found");
            return;

        }

        current.next = current.next.next;



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
