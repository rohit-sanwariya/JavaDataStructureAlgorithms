package TwentyOneDaysAirTribe;

import Interview.Tree.TreeNode;

import java.util.Arrays;

public class LongestZigZagPathInABinaryTree1372 {
    public int longestZigZag(TreeNode root) {
        return Math.max(
                findDepth(
                        root.left,true,0
                ),
                findDepth(
                        root.right,false,0
                )

        );
    }

    public int findDepth(TreeNode node,boolean isLeft,int depth){
        if(node == null){
            return depth;
        }
        if(isLeft ){
           depth = Arrays.stream(new int[]{
                   findDepth(node.right,false,depth+1),
                   findDepth(node.left,true,0)
                   , depth
           }).max().getAsInt();
        }
        else {
            depth = Arrays.stream(new int[]{
                    findDepth(node.left,true,depth+1),
                    findDepth(node.right,false,0)
                    , depth
            }).max().getAsInt();
        }
        return depth;
    }
}
