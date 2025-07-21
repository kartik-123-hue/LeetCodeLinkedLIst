public class RemoveNodesFromLinkedListWithReversing {
    public ListNode removeNodes(ListNode head) {
        // Remove every node which has a node with a greater value anywhere to the right side of it.
        //this is the line why we are starting from behind
        //but we still need to ask the interviewer for if we can change the pointer then only reverse or push them into an array and
        //main a max

        head= reverse(head);
        ListNode temp=head;
        int currMax=temp.val;
        while(temp!=null && temp.next!=null){
           if(temp.next.val<currMax){
               temp.next=temp.next.next;
           }
           else{
               currMax=temp.next.val;
               temp=temp.next;
           }
        }
    return reverse(head);
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

