class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> obj=new HashSet<>();
        for(int n:nums){
            if(obj.contains(n)){
                return n;
            }else{
                obj.add(n);
            }
        }
     return 0;
    }
}