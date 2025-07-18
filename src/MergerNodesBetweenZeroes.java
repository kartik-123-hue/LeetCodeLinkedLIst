public class MergerNodesBetweenZeroes {
    public ListNode mergeNodes(ListNode head) {
        ListNode response=null;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(temp.val!=0){
                sum+= temp.val;
            }
            else if(sum!=0){
                if(response==null){
                    response=new ListNode(sum);
                }
                else{
                    ListNode newNode=new ListNode(sum);
                    while (response.next!=null){
                        response=response.next;
                    }
                    response.next=newNode;
                }
                sum=0;
            }
            temp=temp.next;
        }
        return response;
    }
}
