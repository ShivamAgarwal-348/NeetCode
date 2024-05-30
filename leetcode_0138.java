import java.util.*;

import org.w3c.dom.Node;

public class leetcode_0138 {

    
 
    class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
 
    
    public Node copyRandomList(Node head) {
        
        Node newhead = new Node(-1);
        HashMap<Node, Node> map = new HashMap<>();

        Node temp1 = head;
        Node temp2 = newhead;
        
        while (temp1!= null) {
            Node temp = new Node(temp1.val);
            map.put(temp1, temp);
            temp1 = temp1.next;
        }

        temp1 = head;
        while (temp1!= null) {
            temp2.next = map.get(temp1);
            temp2 = temp2.next;
            temp2.random = map.get(temp1.random);
            temp1 = temp1.next;
        }
        return newhead.next;

        


    }



    public static void main(String[] args) {
        
    }
}
