public class tree1 {

    //structure of node in  a tree


    //inner class
  static   class Node{
        int data;
      Node  left;
       Node right;

       // constructor
        public Node(int value){
            this.data = value;
//            left = null;
//            right = null;

        }

    }


    public static void main(String[] args) {


        Node first1 = new Node(4);
        Node first2 = new Node(14);
        Node first3 = new Node(24);
        Node first4 = new Node(34);
        Node first5 = new Node(44);
        Node first6 = new Node(54);
        Node first7 = new Node(64);
        Node first8 = new Node(74);

        //ptr
        //      root
        //        |
        //       f1
        //      /  \
        //    f2    f3
        //   /   \  / \
        //   f4  f5 f6 f7


        Node root = first1;
        first1.left =first2;
        first1.right =first3;
        first2.left =first4;
        first2.right = first5;
        first3.left = first6;
        first3.right = first7;

        System.out.println(root.left.right.data);



    }




}
