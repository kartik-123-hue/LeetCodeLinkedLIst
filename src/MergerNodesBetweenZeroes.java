public class MergerNodesBetweenZeroes {
    public ListNode mergeNodes(ListNode head) {
       /*
       ListNode dummy=new ListNode(0);
        ListNode response=dummy;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(temp.val!=0){
                sum+= temp.val;
            }
            if(temp.val==0 && sum!=0){
             ListNode newNode=new ListNode(sum);
                 while (response.next!=null){
                      response=response.next;
                 }
                 response.next=newNode;
                sum=0;
            }
            temp=temp.next;
        }
        return dummy.next;
        */
        ListNode temp=head;
        ListNode prev=head;
        temp=temp.next;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                prev.next=temp;
                temp.val=sum;
                prev=prev.next;
                sum=0;
            }
            else{
                sum+= temp.val;
            }
            temp=temp.next;
        }
        return head.next;
    }
}
