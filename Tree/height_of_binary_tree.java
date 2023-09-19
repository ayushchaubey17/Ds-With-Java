// calculate the height of a binary tree

public class height_of_binary_tree {
    static class Node {
        int data;
        Node left,right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static int cal_height(Node root) {

        // it means leaf node found return height to zero
        if (root == null) {
            return 0;
        }

        // go and calculate the height for the left part
        int left_Tree = cal_height(root.left);

        // go and calculate the height for the right part
        int right_Tree = cal_height(root.right);

        //we calculate height for node so add 1 to max of them
        return Math.max(left_Tree, right_Tree)+1 ;
    }

    public static void main(String[] args) {

// ew have created a ree structure
//            5
//           / \
//          6   7
//         /
//        8
//


        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(8);


        //print the node size
        System.out.println("size of node is "+cal_height(root));


    }

}
