class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(s);
        do{
            if(goal.equals(sb.toString())){
                return true;
            }
            char a = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(a);
        }while(!s.equals(sb.toString()));
        return false;
    }
}