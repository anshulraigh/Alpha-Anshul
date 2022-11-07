import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

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
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }//buildTree end

        //tree traversal by preOrder
        public void preOrder(Node root){ //O(n)
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //tree traversal by InOrder
        public void inOrder(Node root){ //O(n)
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        //tree traversal by PostOrder
        public void postOrder(Node root){ //O(n)
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        //tree traversal by levelorder
        public void levelOrder(Node root){//O(n) //iterative way of tree traversal
            //DFS (Depth First Search)
            //eg. preorder , inorder , postorder

            //BFS (Breadth First Order)
            //eg. levelorder traversal 
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println(); // to addd nextline after printing each level
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if (currNode.left!= null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }//BinaryTree end
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data); // print 1 which is our root

        tree.preOrder(root); // print all nodes in preOrder - 1 2 4 5 3 6 
        System.out.println();
        tree.inOrder(root); // print all nodes in inOrder - 4 2 5 1 3 6 
        System.out.println();
        tree.postOrder(root); // print all nodes in postorder - 4 5 2 6 3 1
        System.out.println();
        tree.levelOrder(root);// print all nodes in levelorder - 

    }
}
