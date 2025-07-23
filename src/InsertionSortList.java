public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(curr.val>=prev.val){
                //if the current is more than the previous then it is sorted we do not need to harm it
                prev=curr;
                curr=curr.next;
                continue;
            }

            ListNode temp=dummy;
            while (temp.next.val< curr.val){
                temp=temp.next;
            }

            prev.next=curr.next;
            curr.next=temp.next;
            temp.next=curr;
            curr=prev.next;
        }
        return dummy.next;
    }
}
