import java.util.ArrayList;

public class RootToLeftPaths {
    static class Node{
        int data ;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if (root == null) {
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
    public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer>path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "-->");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
     int values [] = {8,5,3,6,10,11,14};
     Node root = null;
     for (int i = 0; i < values.length; i++) {
        root = insert(root, values[i]);
     }
     ArrayList<Integer> path = new ArrayList<>();
     printRoot2Leaf(root, path);
    }
    /*                 8                       
    *                /   \                     path 1 - 8,5,3
    *               5     10                   path 2 - 8,5,6
    *              / \     \                   path 3 - 8,10,11,14
    *             3   6     11
    *                         \
    *                         14
    */
}
