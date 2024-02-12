package LinkedList;

import java.util.List;

public class ReverseLinkedList {

    private static ListNode reverseLinkList2(ListNode l1){
       ListNode previous = null;
       ListNode currentNode = l1;

       while (currentNode != null){
           ListNode next = currentNode.next;
           currentNode.next = previous;
           previous = currentNode;
           currentNode = next;
       }

       return previous;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode l2 = reverseLinkList(l1);
    }

    private static ListNode reverseLinkList(ListNode l1){

        ListNode previous = null;
        ListNode currentNode = l1;

        while (currentNode != null){
            ListNode next = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = next;
        }

        return previous;


    }
}
