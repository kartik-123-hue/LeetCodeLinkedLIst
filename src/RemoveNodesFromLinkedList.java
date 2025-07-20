public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
       Stack stack=new Stack();
       ListNode temp=head;
       ListNode dummyHead=new ListNode(0);
       while(temp!=null){
           while (!stack.isEmpty() && stack.peek()<temp.val){
               stack.pop();
           }
           stack.push(temp.val);
           temp=temp.next;
       }
       temp=dummyHead;
       for(int num: stack.arr){
           temp.next=new ListNode(num);
           temp=temp.next;
       }
       return dummyHead.next;
    }


}
