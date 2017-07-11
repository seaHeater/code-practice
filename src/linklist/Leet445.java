package linklist;


public class Leet445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return toListNode(getIntValue(l1) + getIntValue(l2));
    }

    public int getIntValue(ListNode l) { //依赖转换成对应数字进行计算，会导致溢出
        int value = 0;
        ListNode current = l;
        do {
            value = 10 * value + current.val;
        } while((current = current.next) !=null);
        return value;
    }

    public ListNode toListNode(int value) {
        ListNode current = null;
        do {
            ListNode newNode = new ListNode(value % 10);
            newNode.next = current;
            current = newNode;
            value = value / 10;
        } while(value != 0);
        return current;
    }

    public void display(ListNode l) {
        while(l.next!=null) {
            System.out.printf(""+l.val);
            l = l.next;
        }
    }

    public ListNode reverse(ListNode l) {
        ListNode node = new ListNode(1);
        return node;
    }

    public static void main(String[] args){

    }
}