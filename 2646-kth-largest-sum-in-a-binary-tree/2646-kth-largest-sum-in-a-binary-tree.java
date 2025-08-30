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

    public static long sortKReturn(List<Long> levelSum,int level, int k){
        Collections.sort(levelSum, Collections.reverseOrder());
        return levelSum.get(k-1);
    }

    public static long kthHelper(TreeNode root,int k){
        if(root == null)return -1 ;

        int level = 0;
        List<Long> levelSum = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            long sum=0;
            for(int i = 0;i<size;i++){
                TreeNode temp = queue.poll();

                sum += temp.val;

                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            levelSum.add(sum);
            level++;
        }
       //for(long i : levelSum) System.out.println(i);
       return (k > level)? -1 :sortKReturn(levelSum , level,k);
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        return kthHelper(root,k);
    }
}