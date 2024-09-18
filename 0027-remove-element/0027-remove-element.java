class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> obj=new ArrayList<>();
        for(int i:nums){
            if(i!=val)
                obj.add(i);
        }
        int i=0;
        for(Integer x: obj){
            nums[i]=x;
            i++;
        }
        return i;
    }
}