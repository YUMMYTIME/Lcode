package lcode;

public class removeElements {

    // single-linked list definition
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public ListNode removeElements( ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur != null && cur.next != null){
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;

            }
        }
        return dummy.next;
    }



}
