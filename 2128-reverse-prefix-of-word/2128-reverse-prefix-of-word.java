class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1){
            return word;
        }
        StringBuilder sb=new StringBuilder(word.substring(0,word.indexOf(ch)+1));
        return sb.reverse().toString()+ word.substring(word.indexOf(ch)+1);
    }
}