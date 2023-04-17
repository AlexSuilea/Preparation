package linkedlist;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode end = head;
        ListNode middle = head;

        while(end != null && end.next != null) {
            end = end.next.next;
            middle = middle.next;
        }
        return middle;
    }
}
