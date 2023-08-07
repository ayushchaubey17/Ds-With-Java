// java code to remove duplicate items from a sorted linked list
public class Remove_Duplicate {
    public static void main(String[] args) {
        Remove_Duplicate obj = new Remove_Duplicate();
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
        obj.printNode();
        // we have created a sorted linked list                                                  1-->1-->1-->1-->2-->3-->4-->5-->5-->5-->6-->null

        obj.delete_Duplicate();
        // linked list after deletion
        obj.printNode();                                                                        //   1-->2-->3-->4-->5-->6-->null


    }


    //method for deleting the duplicate nodes
    public void delete_Duplicate() {
        Node temp = head;                                   // node for traversing the linked list
        while (temp != null && temp.next != null) {         // two conditions bcoz temp traverse  sometimes two steps
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
                // no need to iterate temp ...bcoz ahead value may be same....
            } else {
                temp = temp.next;
                // if value are not same then iterate ahead
            }
        }
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
