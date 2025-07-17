

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SolutionForInterSectionOfList solutionForInterSectionOfList=new SolutionForInterSectionOfList();
        ListNode headA=new ListNode(4);
        headA.next=new ListNode(1);
        headA.next.next=new ListNode(8);
        headA.next.next.next=new ListNode(4);
        headA.next.next.next.next=new ListNode(5);

        ListNode headB=new ListNode(5);
        headB.next=new ListNode(6);
        headB.next.next=new ListNode(1);
        headB.next.next.next=headA.next.next;
        System.out.println(solutionForInterSectionOfList.getIntersectionNode(headA,headB).val);
    }
}