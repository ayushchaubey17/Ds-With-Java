// java code to find length of the linked list
public class find_Length {
    public static void main(String[] args) {
        Singly_LInked_list obj = new Singly_LInked_list();      //previously created class
        obj.insertLast(12);
        obj.insertLast(15);
        obj.insertLast(16);
        obj.insertLast(17);
        obj.insertLast(18);
        obj.printList();

        find(obj.head);             // method call fo counting total node


    }

    //method declare
    public static void find(Singly_LInked_list.Node head) {
        Singly_LInked_list.Node temp = head;
        if (head == null) {
            System.out.println("linked list i empty");
            return;
        }
        int count =1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("the length is "+count);
    }
}
