public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        int size=linkedListSize(head);
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fromBeg=dummy;
        for(int i=0;i<k;i++){
            fromBeg=fromBeg.next;
        }
        ListNode fromEnd=dummy;
        for(int i=0;i<size-k+1;i++){
            fromEnd=fromEnd.next;
        }
        int tempVal= fromBeg.val;
        fromBeg.val= fromEnd.val;
        fromEnd.val=tempVal;
        return dummy.next;
    }

    private int linkedListSize(ListNode head) {
        ListNode temp=head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}
