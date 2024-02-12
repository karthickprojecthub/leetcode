package LinkedList;

public class AddTwoList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while(l1!=null || l2!=null){
            int x = (l1!=null)?l1.val:0;
            int y = (l2!=null)?l2.val:0;

            int sum = x+y+carry;
            carry = sum/10;

            current.next = new ListNode(sum %10);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

            if(carry > 0){
                current.next = new ListNode(carry);
            }


        }
        return dummyHead.next;
    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode ptr = res;
        int cry = 0;
        while(l1!=null||l2!=null){
            int sum = 0+cry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            cry=sum/10;
            sum=sum%10;
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
        }
        if(cry==1){
            ptr.next=new ListNode(1);
        }
        return res.next;
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1, l2);

        //ListNode result = addTwoNumbers2(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 7 0 8
    }
}
