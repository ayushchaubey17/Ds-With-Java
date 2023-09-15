//java code to print the binary tree in level order manner
// we import the linked list and queue classes
import java.util.LinkedList;
import java.util.Queue;

public class level_Order {
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


    public void levelOrder(Node root) {
        if (root == null) {
            // it is the base case
            // return when the root having null node
            return;
        }
        Queue<Node> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()){      //run if queue having some element
            Node temp = que.poll();

            System.out.print(temp.data+" ");


//            after that go to left part
            if (temp.left!= null) {
                que.offer(temp.left);

            }

            //after that go to right part
            if (temp.right != null) {
                que.offer(temp.right);
            }



        }
    }

    public static void main(String[] args) {
        level_Order obj = new level_Order();

        // create the binary trree
        obj.create_Binary_Tree();


    // traversing using level order traversal
        obj.levelOrder(obj.root);
    }


}
