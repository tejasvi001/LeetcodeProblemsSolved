class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> ob1=new ArrayList<>();
        ArrayList<Character> ob2=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            ob1.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            ob2.add(t.charAt(i));
        }
        Collections.sort(ob1);
        Collections.sort(ob2);
        return ob1.equals(ob2);
    }
}