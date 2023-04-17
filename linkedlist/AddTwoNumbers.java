package linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long num1 = 0, num2 = 0, sum = 0, num3=0, num4=0;

        while(l1 != null) {
            num1 = num1 * 10 + l1.value;
            l1 = l1.next;
        }

        while(l2 != null) {
            num2 = num2 *10 + l2.value;
            l2 = l2.next;
        }

        while(num1!=0){
            num3 = num3 * 10 + num1 % 10;
            num1/=10;
        }

        while(num2!=0){
            num4 = num4 * 10 + num2 % 10;
            num2/=10;
        }

        sum = num3 + num4;

        ListNode head = new ListNode(0);
        ListNode newNode = head;

        while(sum!=0) {
            newNode.next = new ListNode(sum%10);
            newNode = newNode.next;
            sum/=10;
        }

        return head.next;
    }
}
