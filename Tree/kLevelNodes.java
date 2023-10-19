public class kLevelNodes {

    //inner class
   static class  Node{
       int data;
       Node left;
       Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void klevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.println(root.data+" ");
        }
        klevel(root.left, level + 1, k);
        klevel(root.right,level+1,k);



    }


    public static void main(String[] args) {
       Node fist1= new Node(20);
       Node fist2= new Node(201);
       Node fist3= new Node(202);
       Node fist4= new Node(203);
       Node fist5= new Node(204);
       Node fist6= new Node(204);
       Node fist7= new Node(205);



        //ptr
        //      root
        //        |
        //       f1
        //      /  \
        //    f2    f3
        //   /   \  / \
        //   f4  f5 f6 f7


       Node root = fist1;
        fist1.left =fist2;
        fist1.right =fist3;
        fist2.left =fist4;
        fist2.right = fist5;
        fist3.left = fist6;
        fist3.right = fist7;

        klevel(root,1,3);



    }
}
