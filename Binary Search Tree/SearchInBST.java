public class SearchInBST {
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
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int values [] = {8,5,10,3,6,11,1,4,14};
        int key = 5;
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        search(root, key);
        if(search(root, key)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
