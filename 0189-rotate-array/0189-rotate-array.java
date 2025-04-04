class Solution {
    public void rotate(int[] nums, int k) {
      Queue<Integer> queue=new LinkedList<>();
       int n=nums.length;
       k%=n;
       for(int i=n-k;i<n;i++){
           queue.add(nums[i]);
       }
       for(int i=0;i<n-k;i++){
           queue.add(nums[i]);
       }
       for(int i=0;i<n;i++){
           nums[i]=queue.remove();
       }
    }
}