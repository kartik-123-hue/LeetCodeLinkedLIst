public class SortListUsingLinkedList {
    public ListNode sortList(ListNode head) {
        // we apply merge sort
        if(head==null || head.next==null){
            return head;
        }
        ListNode left=head;
        ListNode right=getMid(head);
        ListNode temp=right.next;
        right.next=null;
        right=temp;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode dummyTrav=dummy;
        while(left!=null && right!=null){
            if(left.val< right.val){
                dummyTrav.next=new ListNode(left.val);
                left=left.next;
            }
            else{
                dummyTrav.next=new ListNode(right.val);
                right=right.next;
            }
            dummyTrav=dummyTrav.next;
        }
        while (left!=null){
            dummyTrav.next=new ListNode(left.val);
            left=left.next;
            dummyTrav=dummyTrav.next;
        }
        while (right!=null){
            dummyTrav.next=new ListNode(right.val);
            right=right.next;
            dummyTrav=dummyTrav.next;
        }
        return dummy.next;
    }

}
