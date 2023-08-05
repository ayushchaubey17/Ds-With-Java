// java code to delete a node at given place
public class Delete_AT_Position {
    public static void main(String[] args) {
        Delete_AT_Position obj = new Delete_AT_Position();
        obj.insertNode(182);
        obj.insertNode(128);
        obj.insertNode(1286);
        obj.insertNode(125);
        obj.insertNode(156);

        obj.printNode();                    //156-->125-->1286-->128-->182-->null
        //linked list created

        //operation applied
        obj.DeleteAtPlace(3);

        //list after delete
        obj.printNode();                    //156-->125-->128-->182-->null
    }


    // operation to perform deletion at a given place
    public void DeleteAtPlace(int place) {
        if (place == 1) {   // delete first case
            head = head.next;
        }

        int count = 1;
        Node temp = head;
        while (count < place - 1) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }


    //the code below is for creating the linked list
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
