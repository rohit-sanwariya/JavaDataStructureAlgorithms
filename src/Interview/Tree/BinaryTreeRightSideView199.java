package Interview.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
    private static List<Integer> list = new ArrayList<>();
    public static List<Integer> rightSideView(TreeNode node){
        if(node == null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                if(size-1 == i){
                    list.add(curr.val);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return list;
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(1,new TreeNode(2,null,new TreeNode(5,null,null)),new TreeNode(3,new TreeNode(4,null ,null),null));
        System.out.println(rightSideView(head).toString());
    }
}
