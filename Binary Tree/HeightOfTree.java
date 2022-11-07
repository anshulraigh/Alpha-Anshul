public class HeightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    /*                 1
    *                /   \      Height of tree in terms of nodes is - 3
    *               2     3     Height of tree in terms of branch is - 2
    *              / \   / \
    *             4  5   6  7
    */

    //function to calculate tree height
    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        // int lh = height(root.left);
        // int rh = height(root.right);

        // return Math.max(lh, rh) + 1/*this 1 added here to count height of root node of the tree */;
        return (Math.max(height(root.left), height(root.right))+1); //no need of lh & rh now.
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
    }
}
