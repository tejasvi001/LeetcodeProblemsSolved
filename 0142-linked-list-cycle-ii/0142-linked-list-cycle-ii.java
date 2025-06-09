/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean cycle=false;
        ListNode slow=head,fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				cycle=true;
				break;
			}
		}
		if(cycle==false) {
			return null;
		}
		ListNode prev=null;
		slow=head;
		while(slow!=fast) {
			prev=fast;
			slow=slow.next;
			fast=fast.next;
		}
        return slow;
    }
}