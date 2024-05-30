import java.util.*;

public class leetcode_0021 {
    class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode start = null;
        ListNode end = null;
        while (list1!= null && list2 != null) {
            if(list1.val <= list2.val){
                if(start == null){
                    start = end = list1;
                    list1 = list1.next;
                }
                else{
                    end.next = list1;
                    end = end.next;
                    list1 = list1.next;
                }
            }
            else{
                if(start == null){
                    start = end = list2;
                    list2 = list2.next;
                }
                else{
                    end.next = list2;
                    end = end.next;
                    list2 = list2.next;
                }
            }
        }
        if(list1 == null && list2 != null){
            if(start == null){
                    start = end = list2;
                    list2 = list2.next;
                }
                else{
                    end.next = list2;
                    end = end.next;
                    list2 = list2.next;
                }
        }
        if(list2 == null && list1 != null){
            if(start == null){
                    start = end = list1;
                    list1 = list1.next;
                }
                else{
                    end.next = list1;
                    end = end.next;
                    list1 = list1.next;
                }
        }
        return start;

    }
    public static void main(String[] args) {
        
    }
}
