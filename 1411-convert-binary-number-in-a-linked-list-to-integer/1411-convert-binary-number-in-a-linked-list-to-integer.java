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
    public int getDecimalValue(ListNode head) {
        int i=length(head)-1;
        int num=0;
        while(head!=null){
            num=num+(int)Math.pow(2,i)*head.val;
            head=head.next;
            i--;
        }
        return num;
    }
    public int length(ListNode head){
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
}