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
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> obj=new ArrayList<>();
        preorder(root,obj);
        return obj;
    }
      void preorder(Node root,List<Integer> obj){
        if(root==null){
            return;
        }
         obj.add(root.val);
       for(Node n:root.children){
        preorder(n,obj);
       }
    }
}