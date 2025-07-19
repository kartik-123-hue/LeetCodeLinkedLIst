public class MergerNodesBetweenZeroes {
    public ListNode mergeNodes(ListNode head) {
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
    }
}
