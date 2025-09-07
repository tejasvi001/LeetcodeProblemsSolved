class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a :magazine.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(char a :ransomNote.toCharArray()){
            if(map.containsKey(a)){
                if(map.get(a)>1){
                     map.put(a,map.get(a)-1);
                }else{
                     map.remove(a);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}