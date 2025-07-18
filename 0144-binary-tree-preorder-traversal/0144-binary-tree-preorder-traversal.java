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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> obj=new ArrayList<>();
        inorder(root,obj);
        return obj;
    }
    void inorder(TreeNode root,List<Integer> obj){
        if(root==null){
            return;
        }
         obj.add(root.val);
        inorder(root.left,obj);
       
        inorder(root.right,obj);
    }
}