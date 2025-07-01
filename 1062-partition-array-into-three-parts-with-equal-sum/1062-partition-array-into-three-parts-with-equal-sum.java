class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
       int sum=0;
       for(int i:arr){
            sum+=i;
       } 
       if(sum%3!=0){
        return false;
       }
       int each=sum/3,found=0,temp=0;
       for(int i:arr){
        temp+=i;
        if(temp==each){
            found++;
            temp=0;
        }
       }
       if(found<3){
            return false;
       }
       return true;
    }
}