package linkedlist;

public class MainLinkedList {
    public static void main(String[] args) {
//        ListNode node = new ListNode(2);
//        ListNode node1 = new ListNode(4);
//        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(5);
//        ListNode node4 = new ListNode(6);
//        ListNode node5 = new ListNode(4);

        ListNode node = new ListNode(0);
        ListNode node1 = new ListNode(0);


//        node.next = node1; node1.next = node2; node2.next = null;
//        node3.next = node4; node4.next = node5; node5.next = null;

//        MiddleNode middleNode = new MiddleNode();
//        System.out.println(middleNode.middleNode(node).value);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        System.out.println(addTwoNumbers.addTwoNumbers(node, node1));
    }
}
