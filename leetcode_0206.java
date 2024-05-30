import java.util.*;

public class leetcode_0206 {
 
    class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode newhead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newhead;
    }

    public static void main(String[] args) {
        
    }
}
