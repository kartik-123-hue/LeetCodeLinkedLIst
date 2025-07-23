import java.util.List;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
       ListNode leftList=new ListNode(0);
       ListNode rightList=new ListNode(0);
       ListNode ltrav=leftList;
       ListNode rtrav=rightList;
       while(head!=null){
           if(head.val<x){
               ltrav.next=head;
               ltrav=ltrav.next;
           }
           else{
               rtrav.next=head;
               rtrav=rtrav.next;
           }
           head=head.next;
       }
        ltrav.next=rightList.next;
       rtrav.next=null;
       return leftList.next;
    }
}
