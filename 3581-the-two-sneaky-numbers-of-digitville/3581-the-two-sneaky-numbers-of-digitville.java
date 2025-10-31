class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        HashSet<Integer> hashSet=new HashSet<>();
        int counter=0;
        for(int i:nums){
            if(hashSet.contains(i)){
                arr[counter++]=i;
            }else{
                hashSet.add(i);
            }
        }
        return arr;
    }
}