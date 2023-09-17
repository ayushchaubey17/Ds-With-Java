// inorderr traversal in binary search tree

public class inordeer_Traversal {
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

    public void inorder_print(Node root) {
        if (root == null) {
            return;
        }

        inorder_print(root.left);
        System.out.print(root.data+" ");
        inorder_print(root.right);

    }

    public static void main(String[] args) {
        inordeer_Traversal obj = new inordeer_Traversal();
        obj.create_Binary_Tree();
        obj.inorder_print(obj.root);

    }
}
