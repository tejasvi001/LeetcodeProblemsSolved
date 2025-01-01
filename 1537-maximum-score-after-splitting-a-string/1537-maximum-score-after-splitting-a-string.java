class Solution {
    public int maxScore(String s) {
        int maxscore=0;
        int l,r,j;
        for(int i=1;i<=s.length()-1;i++){
            l=0;
            r=0;
            for(j=0;j<i;j++){
                if(s.charAt(j)=='0'){
                    l++;
                }
            }
            for(j=i;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    r++;
                }
            }
            maxscore=Math.max(maxscore,(l+r));
        }
        return maxscore;
    }
}