public class ValidateBST {
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
    //Approach 1 
    /* Check inorder traversal of tree if it's sorted it means Tree is BST */

    //Approach 2
    /* Check if max value in left subtree < node and min value in right subtree > node */
    public static boolean isValidBST(Node root, Node leftMax, Node rightMin) {
        if(root == null) {
            return true;
        }
        
        if(leftMax != null && root.data <= leftMax.data) {
            return false;
        }
        
        if(rightMin != null && root.data >= rightMin.data) {
            return false;
        }
        
        return isValidBST(root.left, leftMax, root) 
            && isValidBST(root.right, root, rightMin);
    }
    public static void main(String[] args) {
     int values [] = {8,5,3,1,4,6,10,11,14}; //true And false if values - {1,1,1}
     Node root = null;
     for (int i = 0; i < values.length; i++) {
        root = insert(root, values[i]);
     }
     System.out.println(isValidBST(root, null, null));
    }
}
