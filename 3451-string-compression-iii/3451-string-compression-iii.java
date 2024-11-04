class Solution {
    public String compressedString(String word) {
        int c=1;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                if(c==9){
                    sb.append(c);
                    sb.append(word.charAt(i));
                    c=1;
                }else{
                    c++;
                }
            }else{
                sb.append(c);
                sb.append(word.charAt(i));
                c=1;
            }
        }
        sb.append(c);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }
}