class Trie {
    static class Node{
		Node children[]=new Node[26];
		boolean endOfWord=false;
		Node(){
			for(int i=0;i<26;i++) {
				children[i]=null;
			}
		}
	}
	public Node root=new Node();
    public Trie() {
        
    }
    
   public void insert(String word) {
		Node curr=root;
		for(int level=0;level<word.length();level++) {
			if(curr.children[word.charAt(level)-'a']==null) {
				curr.children[word.charAt(level)-'a']=new Node();
			}
			curr=curr.children[word.charAt(level)-'a'];
		}
		curr.endOfWord=true;
	}
	public boolean search(String word) {
		Node curr=root;
		for(int level=0;level<word.length();level++) {
			if(curr.children[word.charAt(level)-'a']==null) {
				return false;
			}
			curr=curr.children[word.charAt(level)-'a'];
		}
		return curr.endOfWord==true;
	}
	public boolean startsWith(String word) {
		Node curr=root;
		for(int level=0;level<word.length();level++) {
			if(curr.children[word.charAt(level)-'a']==null) {
				return false;
			}
			curr=curr.children[word.charAt(level)-'a'];
		}
		return true;
	}
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */