public class LowestCommonAncestorApproach2 {
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
    public static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right,n1,n2);

        // leftLca = val , rightLca = null
        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;  //(rightLca & leftLca != null then return root)
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(6);
        root.left.right = new Node(5);

        int n1 = 4,n2=6;
        System.out.println(lca2(root,n1,n2).data); // 1
    }
    //here we have'nt used any auxillary data structure , so we get linear memory consuption cause of recirtion call.
}

