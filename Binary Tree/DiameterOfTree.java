public class DiameterOfTree {
    /*The no. of nodes in the longest path between 2 leaves. */
    // Approach 1 O(n^2)
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
    *                /   \     
    *               2     3     diameter of tree - 5
    *              / \   / \
    *             4  5   6  7
    */
    public static int height(Node root){//O(n)
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1/*this 1 added here to count height of root node of the tree */;
    }

    public static int diameter(Node root){ //O(n^2), cause height itself takes  TC-O(n)
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(Math.max(rightDiam, leftDiam), selfDiam);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}
