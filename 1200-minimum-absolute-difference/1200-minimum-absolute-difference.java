class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff=Math.abs(arr[i]-arr[j]);
                if(diff>minDiff){
                    j=arr.length;
                }
                else if (diff==minDiff){
                    list.add(Arrays.asList(arr[i], arr[j]));
                }
                else{
                    minDiff=diff;
                    list=new ArrayList<>();
                    list.add(Arrays.asList(arr[i], arr[j]));
                }
            }
        }
        return list;
    }
}