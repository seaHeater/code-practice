package linklist;

/**
 * Created by gaojunke on 17/7/10.
 */
public class Leet82 {

    //Given 1->2->3->3->4->4->5, return 1->2->5.
    //Given 1->1->1->2->3, return 2->3.
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode pre = head;
        ListNode current = head.next;
        boolean flag = true;

        while(current.next != null) {
            if(current.val == current.next.val && flag) { //
                flag = false;
                temp = current;
                current = current.next;
            } else if(current.val == temp.val && !flag) {
                current = current.next;
            } else if(current.val != current.next.val && !flag) {
                flag = true;
                pre.next = current.next;
                current = current.next;
            } else {
                current = current.next;
                pre = pre.next;
            }
        }
        return head;
    }

}
