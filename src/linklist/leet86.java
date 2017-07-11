package linklist;

import java.util.List;

/**
 * Created by gaojunke on 17/7/10.
 */
public class leet86 {
    public ListNode partition(ListNode head, int x) {
        //1->4->3->2->5->2 and x = 3
        ListNode current = head;
        ListNode small = null;
        ListNode large = null;

        while(current != null) {
            if(current.val < x) {
                if(small == null) {
                    small = current;
                } else {
                    small.next = current;
                }
                continue;
            } else {
                large.next = current;
            }
        }
    }
}
