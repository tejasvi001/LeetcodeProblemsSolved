class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> obj=new HashSet<>();
        for(int x:nums){
            if(obj.contains(x))
                return true;
            else
                obj.add(x);
        }
        return false;
    }
}