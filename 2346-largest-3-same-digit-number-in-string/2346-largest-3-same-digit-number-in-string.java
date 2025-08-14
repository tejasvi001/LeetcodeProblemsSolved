class Solution {
    public String largestGoodInteger(String s) {
        char a = '/'; // smallest char before '0'
        
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)) {
                if (s.charAt(i) > a) {
                    a = s.charAt(i);
                }
            }
        }
        
        if (a == '/') {
            return "";
        }
        
        String res = String.valueOf(a);
        return res + res + res;
    }
}
