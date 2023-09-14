public class Tree_Representation {
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

    public static void main(String[] args) {

//        make an object  of the class
        Tree_Representation obj = new Tree_Representation();

//        method call for creating the tree
        obj.create_Binary_Tree();

//        print the data of first node
        System.out.println(obj.root.data);

    }
}
