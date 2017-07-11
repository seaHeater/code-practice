package linklist;

/**
 * Created by gaojunke on 17/7/5.
 */
public class leet206 {
    public static ListNode reverseList(ListNode head) {
        ListNode pre = head;
        ListNode current = head.next;
        while(current!=null) {
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        head.next = null;

        //A-->B-->C-->D-->NULL
        //pre=A,cur=B,temp=cur.next,cur.next=pre,cur=temp
        //A<--B  pre=B,cur=C,C.next=B

        return pre;
    }

    public static ListNode toListNode(int value) {
        ListNode current = null;
        do {
            ListNode newNode = new ListNode(value % 10);
            newNode.next = current;
            current = newNode;
            value = value / 10;
        } while (value != 0);
        return current;
    }

    public static void display(ListNode l) {
        while (l != null) {
            System.out.printf("" + l.val);
            l = l.next;
        }
    }

    public static void main(String[] args) {
        ListNode node = toListNode(1);
        display(reverseList(node));
    }
}
