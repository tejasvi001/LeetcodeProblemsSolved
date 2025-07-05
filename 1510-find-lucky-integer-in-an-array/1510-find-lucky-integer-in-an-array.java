class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int lucky=-1;
        for(int i:arr){
            if(i==map.get(i)){
                lucky=Math.max(lucky,i);
            }
        }
        return lucky;
    }
}