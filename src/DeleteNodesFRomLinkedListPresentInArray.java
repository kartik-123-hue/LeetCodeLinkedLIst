import java.util.HashMap;
import java.util.List;

public class DeleteNodesFRomLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer,Integer> hashSet=new HashMap<>();
        for(int num:nums){
            hashSet.put(num,1);
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode prev=dummy;
        while(temp!=null){
            if(hashSet.get(temp.val)!=null && hashSet.get(temp.val)==1){
                prev.next=temp.next;
            }
            else {
                prev = prev.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
