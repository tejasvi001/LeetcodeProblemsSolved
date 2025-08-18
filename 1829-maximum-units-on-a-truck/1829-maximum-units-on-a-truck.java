class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int i=0;
        int v=0;
        while(truckSize>0 && i<boxTypes.length){
            if(boxTypes[i][0]<=truckSize){
                truckSize-=boxTypes[i][0];
                v+=boxTypes[i][1]*boxTypes[i][0];
            }else{
                v+=boxTypes[i][1]*truckSize;
                truckSize=0;
            }
            i++;
        }
        return v;
    }
}