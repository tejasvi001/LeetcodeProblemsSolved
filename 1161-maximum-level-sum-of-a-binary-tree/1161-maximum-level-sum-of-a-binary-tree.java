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
    public int maxLevelSum(TreeNode root) {
        
        if(root==null) {
			return -1;
		}
        int maxsum=root.val;
        int level=1;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		queue.add(null);
        int currlevel=1;
        int currsum=0;
		while(!queue.isEmpty()) {
			TreeNode currNode=queue.remove();
			if(currNode==null) {
				if(maxsum<currsum){
                    maxsum=currsum;
                    level=currlevel;
                }
				if(queue.isEmpty()) {
					break;
				}
				else {
					queue.add(null);
                    currlevel++;
                    currsum=0;
				}

			}
			else {
				currsum+=currNode.val;
				if(currNode.left!=null) {
					queue.add(currNode.left);
					
				}
				if(currNode.right!=null) {
					queue.add(currNode.right);
				}
			}
		}
        return level;
    }
}