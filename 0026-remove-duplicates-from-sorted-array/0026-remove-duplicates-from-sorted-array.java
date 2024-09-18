class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();
        // Filling the TreeMap with the elements of nums array
        for (int x : nums) {
            sortedMap.put(x, sortedMap.getOrDefault(x, 0) + 1);
        }
        int i=0;
        for(Integer key: sortedMap.keySet()){
            nums[i++]=key;
        }
        return i;
    } 
}