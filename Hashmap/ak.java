import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ak {
    Node root;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }

    }
        public static void PreOrder(Node root, ArrayList<Integer> al) {

            if (root == null) {
                return;
            }
            else {

                al.add(root.data);
                PreOrder(root.left,al);
                PreOrder(root.right,al);


            }
        }


    public static void diameter(Node root) {

        if (root == null) {
        }

//        int lh = height(root.left);
//        int rh = height(root.right);
//        int sd = lh+rh+1;




//    return     Math.max(Math.max(ld,rd),sd);




    }

        public static void main(String[] args) {
            Node a = new Node(9);
            Node b = new Node(8);
            Node c = new Node(7);
            Node d = new Node(3);
            Node e = new Node(4);
            Node f = new Node(5);

            Node root = a;
            a.left = b;
            a.right = c;
            c.left = d;
            d.left = e;
            e.left=f;

            ArrayList<Integer> al = new ArrayList<>();
//            PreOrder(root,al);
//
//            for (int x:al
//                 ) {
//                System.out.print(x+"--");
//            }


            levelOrder(root);


        }


    public static void levelOrder(Node root){

        if (root == null) {
            return;
        }

        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);

        while (!qu.isEmpty()){
            Node temp = qu.poll();
            System.out.println(temp.data);

            if (temp.left!=null){
                qu.offer(temp.left);

            }

            if (temp.right!=null){
                qu.offer(temp.right);

            }
        }



    }

}