import java.util.ArrayList;
public class Merge_Two_BST {
    static class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data = data;
        }
    }
    public static void getInorder(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node createBST(ArrayList<Integer> inorder,int st,int end){
        if (st > end) {
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, end);
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
    public static Node mergeBSTs(Node root1,Node root2){
        //step 1
        ArrayList <Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step 2
        ArrayList <Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //merge
        int i=0,j=0;
        ArrayList<Integer> findArr = new ArrayList<>();

        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                findArr.add(arr1.get(i));
                i++;
            }else{
                findArr.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            findArr.add(arr1.get(i));
            i++;
        }

        while(j < arr2.size()){
            findArr.add(arr2.get(j));
            j++;
        }

        // sorted ArrayList --> balance tree
        return createBST(findArr, 0, findArr.size()-1);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.right = new Node(4);
        root1.left = new Node(1);

        Node root2 = new Node(9);
        root2.right = new Node(12);
        root2.left = new Node(3);

        Node root = mergeBSTs(root1, root2);
        preorder(root); // 3,1,2,9,4,12
    }
    /*                 2
    *     BST1       /   \     
    *               1     4                           
    */
    /*    BST2         9
    *                /   \     
    *               3     12                           
    */
    //       After merging both BST1 and BST2
    /*                 3
    *                /   \     
    *               1     9    
    *                \    / \
    *                 2  4   12                        
    */
}
