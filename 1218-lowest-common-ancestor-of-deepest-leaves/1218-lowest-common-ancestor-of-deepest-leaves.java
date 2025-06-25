/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int h=maxDepth(root);
        return lca(root,0,h);
    }
    public TreeNode lca(TreeNode root,int currLevel, int max){
        if (root == null) return null;
        if(currLevel==max-1){
            return root;
        }
        TreeNode left=lca(root.left, currLevel+1,max);
        TreeNode right=lca(root.right,currLevel+1,max);
        if(left==null){
            return right;
        }if(right==null){
            return left;
        }
        return root;
    }
    private int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}