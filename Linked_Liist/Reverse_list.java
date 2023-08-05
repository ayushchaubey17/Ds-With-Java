public class Reverse_list extends Singly_LInked_list {
    public static void main(String[] args) {


        Reverse_list obj = new Reverse_list();
        obj.insertLast(12);
        obj.insertLast(22);
        obj.insertLast(32);
        obj.insertLast(42);
        obj.insertLast(52);
        obj.insertLast(62);

        //printing the linked list
        obj.printList();

        //reversing the linked list
        obj.reverse(obj.head);



    }

    public void reverse(Singly_LInked_list.Node head) {
      Singly_LInked_list.Node ahead = null;
      Singly_LInked_list.Node back = null;
      Singly_LInked_list.Node current = head;

      // reverse code
        while (current != null) {
            ahead = current.next;
            current.next = back;
            back = current;
            current = ahead;
        }
        head = back;

        //print list after revere
        Singly_LInked_list.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"----->");
            temp = temp.next;
        }






    }
}
