package Interview.Tree;

 
import java.util.*;

class NodeToBeInserted {
    NodeToBeInserted left;
    NodeToBeInserted right;
    int data;

    NodeToBeInserted(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class InsertNode {

    public static void preOrder( NodeToBeInserted root ) {

        if( root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

    public static NodeToBeInserted insert(NodeToBeInserted root, int data) {
        if(root == null){
            root = new NodeToBeInserted(data);
            root.left =null;
            root.right = null;
            return root;
        }
        else if(root.data<data){
            root.right = insert(root.right, data);
        }
        else  root.left = insert(root.left, data);
        return root;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        NodeToBeInserted root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}
//6
//4 2 3 1 7 6
//4 2 1 3 7 6