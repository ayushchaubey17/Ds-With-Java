
// java code to search anode in a ingly linked list
public class Search_Node {
    public static void main(String[] args) {

        // this all class and object are created in same package
        Singly_LInked_list obj = new Singly_LInked_list();
        obj.insertFirst(12);
        obj.insertFirst(13);
        obj.insertFirst(14);
        obj.insertFirst(15);
        obj.insertFirst(16);
        obj.printList();

        Search_Node obj1 = new Search_Node();
        obj1.search(obj.head, 14);               //it is method of class Search_Node

    }

    public void search(Singly_LInked_list.Node head, int key) {     //head is pass as parameter
        if (head == null) {
            System.out.println(" list is empty");
            return;
        }

        Singly_LInked_list.Node temp = head;
        int count = 1;                       //for counting the position
        while (temp != null) {              //traverse till last node
            if (temp.data == key) {
                System.out.println("element found at position " + count);
                return;
            }
            temp = temp.next;
            count++;
        }

        System.out.println("element not found");

    }
}
