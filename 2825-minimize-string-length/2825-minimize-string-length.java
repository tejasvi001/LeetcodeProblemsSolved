class Solution {
    public int minimizedStringLength(String s) {
        // HashSet<Character> set=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     set.add(s.charAt(i));
        // }
        // return set.size();
       var map = new boolean[26];
    var ans = 0;
    
    for (var c : s.toCharArray())
      map[c - 'a'] = true;

    for (var c : map) if (c) ans++;
    
    return ans;
    }
}