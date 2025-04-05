class Solution {
    // Function to find the majority elements in the array
    public int majorityElement(int[] nums) {
        // Your code goes here.
        int res=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>nums.length/2){
                res=entry.getKey();
                break;
            }
                
        }
        return res;
    }
}