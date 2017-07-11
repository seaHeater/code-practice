package linklist;

/**
 * Created by gaojunke on 17/7/6.
 */
public class leet21 {
    //Merge two sorted linked lists and return it as a new list.
    // The new list should be made by splicing together the nodes of the first two lists.
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        while(l1!=null) {
            if(l1.val<l2.val) {
                head = l1;
            } else {
                head = l2;
            }
        }
        return head;
    }
}
