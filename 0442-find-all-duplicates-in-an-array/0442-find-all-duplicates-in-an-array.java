class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> obj=new ArrayList<>();
        HashSet<Integer> list2=new HashSet<>();
        for(int x:nums){
            if(list2.contains(x)){
                obj.add(x);
            }
            else{
                list2.add(x);
            }
        }
        return obj;
    }
}