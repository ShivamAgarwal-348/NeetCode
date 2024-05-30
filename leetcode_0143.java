import java.util.*;

public class leetcode_0143 {

    
 
    class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
    
    public void reorderList(ListNode head) {

        ListNode turtle = head;
        ListNode hare = head;

        while (hare != null && hare.next!= null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }

        ListNode first = head;
        ListNode second = turtle.next;
        ListNode prev = null;
        turtle.next = null;
        while (second!= null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;        
        }

        second = prev;

        while (second!=null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
        
    }



    public static void main(String[] args) {
        
    }
}
