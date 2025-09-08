class Solution {
    public int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);   // store the freq along with the items -> (nums[i], freq)
        }

        ArrayList<Integer> list = new ArrayList<>(freq.keySet());  // store all unique items

        Collections.sort(list, (a, b) -> {
            if(freq.get(a).equals(freq.get(b))) {
                return b - a;  // If freq same, sort by value descending
            }
            return freq.get(a) - freq.get(b); // Otherwise by frequency ascending
        });

        int k = 0;
        for(Integer num : list){  // now store the values in the ans array
            int count = freq.get(num);
            while(count>0){
                ans[k++] = num;
                count--;
            }
        }
        return ans;
    }
}