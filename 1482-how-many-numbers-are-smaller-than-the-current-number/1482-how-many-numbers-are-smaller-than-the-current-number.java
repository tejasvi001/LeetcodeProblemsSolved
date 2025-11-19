class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            temp[i]=nums[i];
        Arrays.sort(temp);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<temp.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],i);
            }
        }
        for(int i=0;i<nums.length;i++){
            temp[i]=map.get(nums[i]);
        }
        return temp;
    }
}