class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean appearance[]=new boolean[nums.length];
        for(int i:nums){
            appearance[i-1]=true;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(appearance[i]==false){
                list.add(i+1);
            }
        }
        return list;
    }
}