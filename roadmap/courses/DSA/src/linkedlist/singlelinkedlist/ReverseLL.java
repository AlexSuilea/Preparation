package linkedlist.singlelinkedlist;

public class ReverseLL {
    public static ListNodeSLL reverseList(ListNodeSLL head) {
        ListNodeSLL current = head;
        ListNodeSLL previous = null;
        ListNodeSLL nextCurrent = null;

        while(current != null) {
            nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }
        return previous;
    }
}
