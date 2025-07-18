public class MergeInLinkedList {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //initialise this dummy at the top
        ListNode dummy=new ListNode(0);
        dummy.next=list1;
        ListNode prev=dummy;
        //find the last node to a
        for(int i=0;i<a;i++){
            prev=prev.next;
        }
        //after a (node.next) to wherever the b exist find the node
        ListNode afterA=prev.next;
        for(int i=0;i<b-a;i++){
            afterA=afterA.next;
        }
        //mark the prev to a .next to list 2 and now find end of list2
        prev.next=list2;
        ListNode l2=list2;
        while(l2!=null && l2.next!=null){
            l2=l2.next;
        }
        //after gettig the list2 end we put .next to the next after b
        l2.next=afterA.next;
        return dummy.next;
    }
}
