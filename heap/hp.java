

public class hp {

    Node head;
    class Node{
        int data;
        Node next;
        public Node(int d){
            this.next=null;
            this.data=d;
        }
    } //  structure of node is created
    public void InsertFirst(int d){
        Node n = new Node(d);
//        case 1:
        if (head == null) {  // if linked list is empty
            head = n;
            return;// then head will point new node
        }

        // case 2:
        // if singly list is having some node
        n.next = head; // new node will point that node which is pointed by head
        head = n;     // head pointer will point the new node
    }
    public void Print(){
        if (head == null) {
            System.out.println("Singly linked list id empty");
        }
        Node P = head;
        while (P!=null){
            System.out.print(P.data+" ->");
            P = P.next;
        }
        System.out.print("null");

    }

    public void InsertLast(int d){
        Node n = new Node(d);
        if (head == null) {   // corner case
            head = n;
            return;
        }

        Node ptr = head; // create a pointer
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = n;
    }

    public void InsertNodeInSortedList(int d){
        Node n = new Node(d);

        // 3 case are possible here
       // New Node may be smallest among the nodes or it'll largest in other case it can be middlest also  (These are the cases which are possible)

        if (head == null) {
            head = n;
            return;

        }       // corner case

        if ( n.data<head.data) {
            n.next=head;
            head=n;
            return;
        } // when node is smallest

        // when node is largest among nodes
        Node p = head;
        while (p.next != null){
            p=p.next;
        }
        if (n.data>head.data) {
            p.next= n;
            return;
        }


        // when node is middle
        Node pr = head;
        while(pr.next.data< n.data){
            pr = pr.next;
        }
        n.next = pr.next;
        pr.next=n;
        return;






    }






    public static void main(String[] args) {
        hp ob = new hp();
        ob.InsertFirst(8);
        ob.InsertFirst(7);
        ob.InsertFirst(6);
        ob.Print();
        System.out.println();
        System.out.println();
        ob.InsertLast(22);
        ob.Print();
        System.out.println();
        System.out.println();
        System.out.println();
        ob.InsertNodeInSortedList(45);
        ob.Print();
        System.out.println();
        System.out.println();
        System.out.println();
        ob.InsertNodeInSortedList(3);
        ob.Print();
        System.out.println();
        System.out.println();
        System.out.println();
        ob.InsertNodeInSortedList(9);
        ob.Print();

    }

}