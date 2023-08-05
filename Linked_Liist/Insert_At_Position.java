//java code to insert node at given position
public class Insert_At_Position {
    public static void main(String[] args) {
        Insert_At_Position obj = new Insert_At_Position();
        obj.insertNode(45);
        obj.insertNode(48);
        obj.insertNode(4856);
        obj.insertNode(485);
        obj.insertNode(46);
        // this code is only for creating list

        obj.printNode();                            //46-->485-->4856-->48-->45-->null
        obj.InsertAtPos(100, 5);        //place should be valid

        //after insertion
        obj.printNode();                            //46-->485-->4856-->48-->100-->45-->null

    }


    // code for insert at particular place
    public void InsertAtPos(int value, int place) {
        Node newNode = new Node(value);
        if (place == 1) {       // if place is 1 then it is insertFirst case...
            // we take this at corner case bcoz head value is change in this ...
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;                // for traversing the list
        int count = 1;                  // temp at place 1
        while (count < place - 1) {       // to reach one node before the given place
            temp = temp.next;
            count++;
        }

        // after reaching a node before the given place
        newNode.next = temp.next;
        temp.next = newNode;


    }


    // this code are for use only
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
