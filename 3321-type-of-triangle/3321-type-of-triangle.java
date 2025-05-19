class Solution {
    public String triangleType(int[] nums) {
        if(!isValid(nums))
            return "none";
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int c=set.size();
        switch(c){
            case 3:
                return "scalene";
            case 2:
                return "isosceles";
            default:
                return "equilateral";
        }
    }
  public boolean isValid(int nums[]) {
    return (nums[0] + nums[1] > nums[2]) &&
           (nums[0] + nums[2] > nums[1]) &&
           (nums[1] + nums[2] > nums[0]);
}

}