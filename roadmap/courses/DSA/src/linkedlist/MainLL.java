package linkedlist;

import linkedlist.singlelinkedlist.ListNodeSLL;
import linkedlist.singlelinkedlist.MergeLL;

public class MainLL {
    public static void main(String[] args) {
//        ListNode head  =  new ListNode(1);
//        head.next = new ListNode(2);
//        System.out.println(ReverseLL.reverseList(head).next.val);

        ListNodeSLL list1 = new ListNodeSLL(1);
        list1.next = new ListNodeSLL(2);
        list1.next.next = new ListNodeSLL(4);

        ListNodeSLL list2 = new ListNodeSLL(1);
        list2.next = new ListNodeSLL(3);
        list2.next.next = new ListNodeSLL(5);

        System.out.println(MergeLL.mergeTwoLists(list1,list2).val);
    }
}
