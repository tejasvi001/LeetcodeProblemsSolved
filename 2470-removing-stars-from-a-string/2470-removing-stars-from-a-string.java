class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char a :s.toCharArray()){
            if(a=='*'&&!stack.isEmpty()){
                stack.pop();
            }else {
                stack.push(a);
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}