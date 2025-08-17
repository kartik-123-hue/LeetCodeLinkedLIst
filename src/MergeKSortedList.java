public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(ListNode list:lists){
            ListNode head=list;
                temp.next=head;
                while(temp!=null && temp.next!=null){
                    temp=temp.next;
                }
            }
       ListNode sortedList= sort(dummy.next);
        return sortedList;
    }

    public ListNode sort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode left=head;
        ListNode right=slow.next;
        slow.next=null;
        left=sort(left);
        right=sort(right);
        return mergeList(left,right);
    }
    public ListNode mergeList(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode dummyTrav=dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                dummyTrav.next=new ListNode(left.val);
                left=left.next;
                dummyTrav=dummyTrav.next;
            }
            else{
                dummyTrav.next=new ListNode(right.val);
                right=right.next;
                dummyTrav=dummyTrav.next;
            }
        }
        while(left!=null){
            dummyTrav.next=new ListNode(left.val);
            left=left.next;
            dummyTrav=dummyTrav.next;
        }
        while(right!=null){
            dummyTrav.next=new ListNode(right.val);
            right=right.next;
            dummyTrav=dummyTrav.next;
        }
        return dummy.next;
    }
}
