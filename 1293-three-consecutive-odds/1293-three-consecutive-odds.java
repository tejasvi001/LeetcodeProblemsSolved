class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd=0;
        if(arr.length<3){
            return false;
        }
        for(int i=0;i<3;i++){
            if(arr[i]%2==1){
                odd++;
            }
        }
        if(odd==3){
            return true;
        }
        for(int i =3;i<arr.length;i++){
            if(arr[i-3]%2==1){
                odd--;
            }
            if(arr[i]%2==1){
                odd++;
            }
            if(odd==3){
                return true;
            }
        }
        return false;
    }
}