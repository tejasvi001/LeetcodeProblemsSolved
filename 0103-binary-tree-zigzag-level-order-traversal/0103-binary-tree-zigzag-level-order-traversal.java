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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         if (root == null) return new LinkedList<>();
        List<List<Integer>> list=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list1=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        boolean level=true;
        while(!queue.isEmpty()){
            TreeNode currNode=queue.remove();
            if(currNode==null){
                level=!level;
                list.add(list1);
                if(queue.isEmpty()){
                    break;
                }
                queue.add(null);
                list1=new LinkedList<Integer>();
            }else{
                if(level)
                    list1.add(currNode.val);
                else
                    list1.add(0,currNode.val);
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
        }
        return list;
    }
}