class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       if(flowerbed.length>1){
        if(flowerbed[0]==0&&flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0){
            n--;
            flowerbed[flowerbed.length-1]=1;
        }
        }else{
            if(flowerbed[0]==0&&n>0){
                n--;
                flowerbed[0]=1;
            }
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                i++;
                n--;
            }
        }   
        if(n<1){
            return true;
        }else{
            return false;
        }
    }
}