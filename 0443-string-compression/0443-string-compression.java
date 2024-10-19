class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        sb.append(chars[0]);
        int c=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                c++;
            }else{
                if(c>1){
                    sb.append(c);
                    c=1;
                }
                sb.append(chars[i]);
            }
        }
        if(c>1){
            sb.append(c);
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}