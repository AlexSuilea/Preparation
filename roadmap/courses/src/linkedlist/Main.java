package linkedlist;

public class Main {
    public static void main(String[] args) {
//        ListNode head  =  new ListNode(1);
//        head.next = new ListNode(2);
//        System.out.println(ReverseLL.reverseList(head).next.val);

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        System.out.println(MergeLL.mergeTwoLists(list1,list2).val);
    }
}
