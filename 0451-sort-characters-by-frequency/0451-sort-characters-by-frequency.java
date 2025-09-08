class Number implements Comparable<Number>{
    char ch ;
    int freq;
    Number(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    public int compareTo(Number that){
        return that.freq-this.freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            pq.offer(new Number(entry.getKey(),entry.getValue()));
        }

        StringBuilder str = new StringBuilder();
        while(!pq.isEmpty()){
            Number num = pq.poll();
            for(int i=0; i<num.freq;i++){
                str.append(num.ch);
            }
        }
        return str.toString();
    }
}