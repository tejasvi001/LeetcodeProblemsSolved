class Solution {
    public String reverseVowels(String s) {
        // Stack<Character> stack=new Stack<>();
        // for(int  i=0;i<s.length();i++){
        //      if(isVowel(s.charAt(i))){
        //         stack.push(s.charAt(i));
        //      }
        // }
        // StringBuilder sb=new StringBuilder(s);
        // for(int i=0;i<s.length();i++){
        //     if(isVowel(s.charAt(i))){
        //         sb.setCharAt(i,stack.pop());
        //     }
        // }
        StringBuilder sb=new StringBuilder(s);
        int start=0;
        int end=s.length()-1;
        int vowelStart=-1;
        int vowelEnd =-1;
        while(start<=end){
            if(isVowel(sb.charAt(start))){
                vowelStart=start;
            }else{
                start++;
            }
            if(isVowel(sb.charAt(end))){
                vowelEnd=end;
            }else{
                end--;
            }
            if(vowelStart!=-1&&vowelEnd!=-1){
                char a=sb.charAt(vowelStart);
                sb.setCharAt(vowelStart,sb.charAt(vowelEnd));
                sb.setCharAt(vowelEnd,a);
                vowelStart=-1;
                vowelEnd=-1;
                start++;
                end--;
            }
        }
        return sb.toString();
    }
    public boolean isVowel(char a){
        switch(a){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                 return true;
        }
        return false;
    }
}