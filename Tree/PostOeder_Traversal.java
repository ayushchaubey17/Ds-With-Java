public class PostOeder_Traversal {
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


    public void postorder(Node root) {
        if (root == null) {
            // it is the base case
            // return when the root having null node
            return;
        }
        postorder(root.left);               //move to left
        postorder(root.right);              // move to right
        System.out.print(root.data+" ");

    }

    public static void main(String[] args) {
        PostOeder_Traversal obj = new PostOeder_Traversal();
        obj.create_Binary_Tree();
        obj.postorder(obj.root);


    }
}
