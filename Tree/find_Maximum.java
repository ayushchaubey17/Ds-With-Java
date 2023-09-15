// java code to find the maximum element of a binary  tree

public class find_Maximum {

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

    public int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int result = root.data;             // root value is stored in result
        int left = findMax(root.left);      // this method recursively call and find the maximum value in the left part
        int right = findMax(root.right);    // this method recursivelly call and find the maximum value from right part

        // after calculating all the threee values
        if (left > result) {        // left is greater than result
            result = left;          // result is updated to left value
        }

        if (right > result) {       // right is greater than result
            result = right;         //result is updated to the right value
        }


        return result;



    }


    public static void main(String[] args) {
        find_Maximum obj = new find_Maximum();

        //for creating the binary tree
        obj.create_Binary_Tree();

//        findmax method returns result and stored in max
        int max = obj.findMax(obj.root);
        System.out.println("the maximum element is "+ max);

    }
}
