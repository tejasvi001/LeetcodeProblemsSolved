/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1=head;
        for(int i=0;i<k-1;i++)
            temp1=temp1.next;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count-k;i++)
            temp=temp.next;
        int x=temp.val;
        temp.val=temp1.val;
        temp1.val=x;
        return head;
    }
}