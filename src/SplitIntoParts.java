public class SplitIntoParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        int base_length=length/k;
        int remainder=length%k;
        temp=head;
        ListNode[] res=new ListNode[k];
        for(int i=0;i<k;i++){
            res[i]=temp;
            for(int j=0;j<base_length-1+(remainder>0?1:0);j++){
                if(temp==null){
                    break;
                }
                temp=temp.next;
            }
            if(temp!=null){
                ListNode curr=temp.next;
                temp.next=null;
                temp=curr;
            }
            remainder--;
        }
        return res;
    }
}
