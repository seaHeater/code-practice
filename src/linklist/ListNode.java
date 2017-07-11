package linklist;

/**
 * Created by gaojunke on 17/7/4.
 */
public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }

     public static void display(ListNode l) {
          while (l != null) {
               System.out.printf("" + l.val);
               l = l.next;
          }
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
}
