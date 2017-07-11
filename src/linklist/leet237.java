package linklist;

/**
 * Created by gaojunke on 17/7/4.
 */
public class leet237 {

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {//1-->2-->3-->4

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
