package linklist;

/**
 * Created by gaojunke on 17/7/5.
 */
public class leet160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode interHead = null;
        ListNode curA = headA;
        ListNode cur = null;
        while(curA!=null) {
            if(match(headB, curA)) {
                if(interHead == null) {
                    interHead = curA;
                    cur = interHead;
                } else {
                    cur.next = curA;
                    cur = cur.next;
                }
            }
            curA = curA.next;
        }
        if(cur != null) {
            cur.next = null;
        }
        return interHead;
    }

    public static boolean match(ListNode list, ListNode node) {
        ListNode curB = list;
        while (curB != null) {
            if (node.val == curB.val) {
                return true;
            }
            curB = curB.next;
        }
        return false;
    }

    public static ListNode toListNode(int value) {
        ListNode current = null;
        do {
            ListNode newNode = new ListNode(value % 10);
            newNode.next = current;
            current = newNode;
            value = value / 10;
        } while(value != 0);
        return current;
    }

    public static void main(String[] args) {
        ListNode.display(leet160.getIntersectionNode(leet160.toListNode(1), leet160.toListNode(3456)));
    }
}
