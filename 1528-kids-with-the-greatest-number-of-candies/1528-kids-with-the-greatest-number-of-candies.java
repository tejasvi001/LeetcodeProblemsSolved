class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int x:candies){
            max=Math.max(x,max);
        }
        List<Boolean> obj=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                obj.add(true);
            }else{
                obj.add(false);
            }
        }
        return obj;
    }
}