// java code to find the middle node

public class Find_Middle_Node {
    public static void main(String[] args) {
        Find_Middle_Node obj = new Find_Middle_Node();
        obj.insertNode(159);
        obj.insertNode(158);
        obj.insertNode(1528);
        obj.insertNode(1562);
        obj.insertNode(156);
        obj.insertNode(153);
        obj.insertNode(155);
        obj.printNode();
        // till now method calls for creating the linked list

        //this method call i for finding the middle node
        obj.middle();


    }

    // method for find middle node
    public void middle() {
        Node slow = head;
        Node fast = head;

        // two condition bcoz fast pointer move two step at a time so
        //if odd node then fast.next is null while in even node fast i null
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle Node is " + slow.data);
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
