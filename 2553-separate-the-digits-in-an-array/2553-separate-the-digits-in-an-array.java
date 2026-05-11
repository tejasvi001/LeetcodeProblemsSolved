class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list =new ArrayList<>();
        for(int i:nums){
            List<Integer> tempList=seprateDigitsInOneNumber(i);
            for(Integer j:tempList)
                list.add(j);
        }
        
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }   
        return intArray;
    }
    public List<Integer> seprateDigitsInOneNumber(int n){
        List<Integer> result=new ArrayList<>();
        while(n>0){
            result.add(n%10);
            n/=10;
        }
        Collections.reverse(result);
        return result;
    }
}