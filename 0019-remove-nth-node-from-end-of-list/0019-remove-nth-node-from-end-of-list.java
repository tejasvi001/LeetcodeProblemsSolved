class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node simplifies edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Count total nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // Find the (count - n)th node (node before the one to delete)
        temp = dummy;
        for (int i = 0; i < count - n; i++) {
            temp = temp.next;
        }
        
        // Delete the nth node from end
        temp.next = temp.next.next;
        
        return dummy.next;
    }
}
