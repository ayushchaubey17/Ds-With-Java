//java code to insert in a binary search tree

public class Insert_In_Binary_Search {
    Node root;
    //this is for creating the node structure
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int value) {
            this.data = value;
        }
    }





    //this method is for taking the key valuee
    public void insert1(int key) {
        root = insert(root,key);
    }


    public Node insert(Node root, int key) {
        // base casse
        if (root == null) {
            root = new Node(key);
            return root;
        }


        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        else {
            root.right = insert(root.right, key);
        }
        return root;
        }


       public void print(Node root) {
        if (root == null) {
            return;
        }


    }



    public static void main(String[] args)
    {

        Insert_In_Binary_Search obje = new Insert_In_Binary_Search();

        obje.insert1( 18);
        obje.insert1( 12);
        obje.insert1( 13);
        obje.insert1( 14);
        obje.insert1( 218);
        obje.insert1( 138);
        obje.insert1( 188);
        obje.print(obje.root);
    }
}

