//java code to valid binary search
public class validate_Binary_Search_Tree {

    Node root;
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void create_Tree() {
        Node first = new Node(9);
        Node sec = new Node(7);
        Node third = new Node(15);
        Node four = new Node(2);
        Node five = new Node(5);
        // its not a binary search tree

        root = first;
        first.left = sec;
        first.right = third;
        sec.left = four;
        sec.right = five;
    }

    public boolean isValid(Node root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.data > max || root.data<min) {
            return false;
        }

        boolean left = isValid(root.left, min, root.data);

        // check for right only if left is true
        if (left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }





    public static void main(String[] args) {
        validate_Binary_Search_Tree obj = new validate_Binary_Search_Tree();
        obj.create_Tree();

        //print that isvalid or not
        System.out.println(obj.isValid(obj.root,Long.MIN_VALUE,Long.MAX_VALUE));


    }
}
