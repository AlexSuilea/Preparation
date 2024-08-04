package linkedlist.singlelinkedlist;

public class MergeLL {
    public static ListNodeSLL mergeTwoLists(ListNodeSLL list1, ListNodeSLL list2) {
        ListNodeSLL dummy = new ListNodeSLL(0);
        ListNodeSLL node = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if(list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }
        return dummy.next;
    }
}
