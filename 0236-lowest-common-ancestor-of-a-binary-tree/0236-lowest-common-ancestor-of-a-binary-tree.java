/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        if(root==null) {
			return null;
		}
		if(root.val==n1.val||root.val==n2.val) {
			return root;
		}
		TreeNode leftLca=lowestCommonAncestor(root.left,n1,n2);
		TreeNode rightLca=lowestCommonAncestor(root.right,n1,n2);
		if(leftLca==null) {
			return rightLca;
		}
		if(rightLca==null) {
			return leftLca;
		}
		return root;
    }
}