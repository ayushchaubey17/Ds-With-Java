//java code for findig a elemnt in the binary seearch tree

public class Search_In_Binary_Search_Tree {
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


    // method for searching
    public Node search(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }


    public void search2(int key) {
        Node x = search(root, key);
        if (x == null) {
            System.out.println("element not found");
        } else {
            System.out.println("element found");
        }
    }




    public static void main(String[] args) {
        Search_In_Binary_Search_Tree obj = new Search_In_Binary_Search_Tree();
        obj.insert1( 18);
        obj.insert1( 12);
        obj.insert1( 13);
        obj.insert1( 14);
        obj.insert1( 218);
        obj.insert1( 138);
        obj.insert1( 188);
        obj.search2(15);


    }
}
