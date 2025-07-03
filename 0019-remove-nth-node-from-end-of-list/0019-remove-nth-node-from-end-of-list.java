class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int remove = len - n;
        temp = dummy; 
        for (int i = 0; i < remove; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}