class Solution {
    public List<Integer> findDuplicates(int[] arr) {
       Arrays.sort(arr);
       ArrayList<Integer> arrayList=new ArrayList<>();
       for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]&&arrayList.contains(arr[i])==false){
                arrayList.add(arr[i]);
            }
       }
       return arrayList;
    }
}