class Solution {
    public int commonFactors(int a, int b) {
        HashSet<Integer> set=new HashSet<>();
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=1;i<=a/2;i++){
            if(a%i==0)
                set.add(i);
        }
        set.add(a);
        int c=0;
        for(int x:set){
            if(b%x==0){
                c++;
            }
        }
        return c;
    }
}