class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        findSubsets(nums,0,ans,res);
        return res;
    }
    public void findSubsets(int nums[],int i,List<Integer> ans,List<List<Integer>> res) {
		if(nums.length==i) {
			res.add(new ArrayList<>(ans));
			return;
        }
        ans.add(nums[i]);
		findSubsets(nums,i+1,ans,res);
        ans.remove(ans.size()-1);
		findSubsets(nums,i+1,ans,res);
	}
}