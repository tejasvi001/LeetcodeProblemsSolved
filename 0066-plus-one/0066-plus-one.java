class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
          if(digits[i]<9){
               digits[i]++;
               return digits;
          }
            digits[i]=0;
        }
        int digits1[]=new int[digits.length+1];
        digits1[0]=1;
        return digits1;
    }
}