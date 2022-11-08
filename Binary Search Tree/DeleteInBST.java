public class DeleteInBST {
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
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static Node delete(Node root,int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{
            // case 1 - leaf Node 
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            //case 3 - Two children
            else{
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
            }    
        }
        return root;
    }
    private static Node findInorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
     int values [] = {8,5,3,1,4,6,10,11,14};
     int val = 10;
     Node root = null;
     for (int i = 0; i < values.length; i++) {
        root = insert(root, values[i]);
     }
     inorder(root); //1 3 4 5 6 8 10 11 14
     delete(root,val);
     System.out.println();
     inorder(root); // 1 3 4 5 6 8 11 14
    }
    /*                 8
    *                /   \     
    *               5     10     
    *              / \     \
    *             3   6     11
    *            / \         \
    *           1  4          14
    */
    // After deletion of node 10 tree look like
    /*                 8
    *                /   \     
    *               5     11     
    *              / \     \
    *             3   6     14
    *            / \         
    *           1  4         
    */
}
