import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] arr, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            if(i < k){
                pq.add(new BigInteger(arr[i]));
            }else {
                BigInteger val = new BigInteger(arr[i]);
                if(val.compareTo(pq.peek()) > 0){
                    pq.remove();
                    pq.add(val);
                }
            }
        }
        return pq.remove().toString();
    }
}