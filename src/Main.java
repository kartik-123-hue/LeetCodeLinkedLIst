

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SolutionForInterSectionOfList solutionForInterSectionOfList=new SolutionForInterSectionOfList();
        SolutionForInterSectionOfListWithPointer solutionForInterSectionOfListWithPointer=new SolutionForInterSectionOfListWithPointer();
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
        System.out.println(solutionForInterSectionOfListWithPointer.getIntersectionNode(headA,headB).val);

        MergeInLinkedList mergeInLinkedList=new MergeInLinkedList();
        ListNode list1=new ListNode(10);
        list1.next=new ListNode(1);
        list1.next.next=new ListNode(13);
        list1.next.next.next=new ListNode(6);
        list1.next.next.next.next=new ListNode(9);
        list1.next.next.next.next.next=new ListNode(5);
        ListNode list2=new ListNode(1000000);
        list2.next=new ListNode(1000001);
        list2.next.next=new ListNode(1000002);
        mergeInLinkedList.mergeInBetween(list1,3,4,list2);

        MergerNodesBetweenZeroes mergerNodesBetweenZeroes=new MergerNodesBetweenZeroes();
        ListNode head=new ListNode(0);
        head.next=new ListNode(3);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(0);
        head.next.next.next.next=new ListNode(4);
        head.next.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next.next=new ListNode(2);
        head.next.next.next.next.next.next.next=new ListNode(0);
        mergerNodesBetweenZeroes.mergeNodes(head);
    }
}