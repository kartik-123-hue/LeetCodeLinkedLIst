public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            ListNode nextPair=curr.next.next;
            ListNode second=curr.next;
            second.next=curr;
            curr.next=nextPair;
            prev.next=second;
            prev=curr;
            curr=nextPair;
        }
        return dummy.next;
    }


}
