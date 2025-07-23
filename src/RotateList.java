public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        int n=size(head);
        if(n>0){
            for(int i=0;i<(k%n);i++){
                head=rotateList(head);
            }
        }
        return head;
    }
    private int size(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    private ListNode rotateList(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        curr.next=head;
        return curr;
    }

}
