public class MaxTwinSumOfLinkedList {
    public int pairSum(ListNode head) {

        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        ListNode reverseOfSecondHalf=reverse(temp);
        ListNode firstHalf=head;
        ListNode secondHalf=reverseOfSecondHalf;
        int res=Integer.MIN_VALUE;
        while(firstHalf!=null && secondHalf!=null){
            res=Math.max(res,firstHalf.val+ secondHalf.val);
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return res;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
