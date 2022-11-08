public class SortedArrayToBalancedBST {
    static class Node{
        int data ;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBBST(int arr[],int st,int end){
        if (st > end) {
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBBST(arr, st, mid-1);
        root.right = createBBST(arr,mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int arr [] = {3,5,6,8,10,11,12};
        Node root = createBBST(arr, 0, arr.length-1);
        preorder(root);
    }
    /*     array = { 3,5,6,8,10,11,12}      
    *                  8
    *                /   \          
    *               5     11        
    *              / \    / \
    *             3   6  10  12   
    *                        
    *          
    */
}
