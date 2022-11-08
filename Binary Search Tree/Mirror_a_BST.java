public class Mirror_a_BST {
    static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 }; 
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        preorder(root);
        root = createMirror(root);
        System.out.println();
        preorder(root);
    }
    /*                 8
    *                /   \     
    *               5     10     
    *              / \     \
    *             3   6     11
    *            / \         \
    *           1  4          14
    */
    //           Mirror of Tree
    /*                 8
    *                /   \     
    *               10     5    
    *              /      / \
    *             11      6  3
    *            /          / \
    *           14         4   1
    */
}
