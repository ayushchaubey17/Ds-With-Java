//Representation of binary search tree

public class Binary_Search_Tree {
    class Node{
        Node left ;
        Node right;
        int data;
        public Node(int value) {
            this.data = value;
            this.left = null;
            this.right = null;

        }

    }

    public static void main(String[] args) {
        Binary_Search_Tree bst = new Binary_Search_Tree();
        // something more about binary search tree
        //1. left node have value always less than root node
        //2. right node have value always more than root node
        //3. it is valid for all the subtree

    }

}
