class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length()%k==0?s.length()/k:s.length()/k+1;
        String arr[]=new String[n];
        if(s.length()%k==0)
            for(int i=0;i<n;i++)
                 arr[i]=s.substring(i*k,(i+1)*k);
        else{
            int i;
             for( i=0;i<n-1;i++)
                 arr[i]=s.substring(i*k,(i+1)*k);
             arr[n-1]=s.substring(i*k);
        }
        if(arr[arr.length-1].length()!=k){
            while(arr[arr.length-1].length()!=k){
                arr[arr.length-1]+=fill;
            }
        }
        return arr;
    }
}