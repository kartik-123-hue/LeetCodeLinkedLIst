import java.util.Stack;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode head=null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry>0){
            int val1=s1.isEmpty()?0:s1.pop();
            int val2=s2.isEmpty()?0:s2.pop();
            int total=val1+val2+carry;
            carry=(total)/10;
            ListNode newNode=new ListNode((total)%10);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
}