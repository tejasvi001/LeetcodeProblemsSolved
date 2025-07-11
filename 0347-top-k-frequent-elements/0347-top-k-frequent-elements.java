class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mpp = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(
            Comparator.comparingInt(Map.Entry :: getValue)
        );

        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k)
                minHeap.poll();
        }

        int result[] = new int[k];
        int index = 0;

        while(!minHeap.isEmpty())
            result[index++] = minHeap.poll().getKey();

        return result;
    }
}