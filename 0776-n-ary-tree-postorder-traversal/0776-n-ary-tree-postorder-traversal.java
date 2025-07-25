/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> obj=new ArrayList<>();
        postorder(root,obj);
        return obj;
    }
      void postorder(Node root,List<Integer> obj){
        if(root==null){
            return;
        }
         
       for(Node n:root.children){
        postorder(n,obj);
       }
       obj.add(root.val);
    }
}