public class Preorder_Traversal {
    Node root;


    // for structure of tree Node
    class Node {
        Node left;
        Node right;
        int data;

        public Node(int value) {
            this.data = value;
        }
    }

    //create the binary tree
    public void create_Binary_Tree() {

        //here we are creating nodes for the binary tree
        Node first = new Node(11);
        Node second = new Node(12);
        Node third = new Node(13);
        Node fourth = new Node(14);
        Node fifth = new Node(15);
        Node six = new Node(16);


        //lets make a link there

        root = first;
//                            root----->first
        first.left = second;
        first.right = third;
//                            second<-----first----->third

        second.left = fourth;
        second.right = fifth;
//                         fourth<------second----->fifth

        third.left = six;
//                            six<-------third---->null
    }



    // method declaration  for printing in a preorder manneer
    public void preOrder(Node root) {  // this takes root as a parameter
        if (root == null) {
            // it is the base case
            // return when the root having null node
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);                //again move to left
        preOrder(root.right);               //again move to right

    }



// main  method
    public static void main(String[] args) {
//        object for the class
        Preorder_Traversal obj = new Preorder_Traversal();

//        create tree structure
        obj.create_Binary_Tree();

//        print in the preorder manner
        obj.preOrder(obj.root);

    }

}
