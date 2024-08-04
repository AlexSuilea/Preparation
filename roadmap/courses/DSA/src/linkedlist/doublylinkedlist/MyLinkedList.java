package linkedlist.doublylinkedlist;

public class MyLinkedList {
    public ListNodeDLL left;
    public ListNodeDLL right;

    public MyLinkedList() {
        this.left = new ListNodeDLL(0);
        this.right = new ListNodeDLL(0);
        left.next = right;
        right.prev = left;
    }

    public int get(int index) {
        ListNodeDLL curr = left.next;
        while(curr != null && index > 0){
            curr = curr.next;
            index -= 1;
        }
        if(curr != null && curr != right && index == 0) {
            return curr.val;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNodeDLL node = new ListNodeDLL(val);
        ListNodeDLL next = left.next;
        ListNodeDLL prev = left;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public void addAtTail(int val) {
        ListNodeDLL node = new ListNodeDLL(val);
        ListNodeDLL next = right;
        ListNodeDLL prev = right.prev;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public void addAtIndex(int index, int val) {
        ListNodeDLL cur = left.next;
        while(cur != null && index > 0) {
            cur = cur.next;
            index -= 1;
        }
        if(cur != null && index == 0) {
            ListNodeDLL node = new ListNodeDLL(val);
            ListNodeDLL next = cur;
            ListNodeDLL prev = cur.prev;
            prev.next = node;
            next.prev = node;
            node.next = next;
            node.prev = prev;
        }
    }

    public void deleteAtIndex(int index) {
        ListNodeDLL cur = left.next;
        while(cur != null && index > 0) {
            cur = cur.next;
            index -= 1;
        }
        if(cur != null && cur != right && index == 0) {
            ListNodeDLL next = cur.next;
            ListNodeDLL prev = cur.prev;
            next.prev = prev;
            prev.next = next;
        }
    }
}
