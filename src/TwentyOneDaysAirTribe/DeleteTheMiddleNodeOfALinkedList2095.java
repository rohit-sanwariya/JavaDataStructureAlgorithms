package TwentyOneDaysAirTribe;
import Interview.LinkedListPractice.ListNode;
import java.util.ArrayList;
import java.util.List;

public class DeleteTheMiddleNodeOfALinkedList2095 {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode fast=head,slow=dummy;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }


        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,4,7,1,2,6));
        head.val = list.get(0);
        ListNode temp = head;
        for (int i=1 ; i<list.size();i++){
            temp.next = new ListNode(list.get(i),null);
            temp = temp.next;
        }
        deleteMiddle(head);
    }
}
