public class Build_a_BST{
/* Values = {5,1,3,,4,2,7} 
 * 1,2,3,4,5,7 -->  inorder is sorted
*/
static class Node{
    int data;
    Node right,left;
    Node(int data){
        this.data = data;
    }
}
public static void inorder(Node root){
    if (root == null) {
        return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
public static Node insert(Node root,int val){
    if (root == null) {
        root = new Node(val);
        return root;
    }
    if (root.data > val) {
        //left subtree
        root.left = insert(root.left, val);
    }else{
        //right subtree
        root.right = insert(root.right, val);
    }
    return root;
}
public static void main(String[] args) {
    int values[] = {5,1,3,4,2,7}; 
    Node root = null;
    for (int i = 0; i < values.length; i++) {
        root = insert(root, values[i]);
    }
    inorder(root); //1,2,3,4,5,7
}
   /*                  1
    *                /   \     
    *               2     3     
    *              / \   / \
    *             4  5   6  7
    */
}