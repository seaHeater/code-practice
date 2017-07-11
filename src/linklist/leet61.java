package linklist;

/**
 * Created by gaojunke on 17/7/9.
 */
public class leet61 {
    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null) {
            return head;
        }
        int len=0;
        ListNode cur = head;
        while(cur!=null) {
            len++;
            cur = cur.next;
        }

        int pos = len - k % len;
        if(pos == len) {
            return head;
        }
        cur = head;
        for(int i = 1; i < pos; i++) {
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        cur = newHead;
        while(cur.next!=null) {
            cur = cur.next;
        }
        cur.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        leet61.rotateRight(ListNode.toListNode(12345), 5);
    }
}
