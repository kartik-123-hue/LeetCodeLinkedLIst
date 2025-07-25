//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        SolutionForInterSectionOfList solutionForInterSectionOfList=new SolutionForInterSectionOfList();
//        SolutionForInterSectionOfListWithPointer solutionForInterSectionOfListWithPointer=new SolutionForInterSectionOfListWithPointer();
//        ListNode headA=new ListNode(4);
//        headA.next=new ListNode(1);
//        headA.next.next=new ListNode(8);
//        headA.next.next.next=new ListNode(4);
//        headA.next.next.next.next=new ListNode(5);
//
//        ListNode headB=new ListNode(5);
//        headB.next=new ListNode(6);
//        headB.next.next=new ListNode(1);
//        headB.next.next.next=headA.next.next;
//        System.out.println(solutionForInterSectionOfList.getIntersectionNode(headA,headB).val);
//        System.out.println(solutionForInterSectionOfListWithPointer.getIntersectionNode(headA,headB).val);
//
//        MergeInLinkedList mergeInLinkedList=new MergeInLinkedList();
//        ListNode list1=new ListNode(10);
//        list1.next=new ListNode(1);
//        list1.next.next=new ListNode(13);
//        list1.next.next.next=new ListNode(6);
//        list1.next.next.next.next=new ListNode(9);
//        list1.next.next.next.next.next=new ListNode(5);
//        ListNode list2=new ListNode(1000000);
//        list2.next=new ListNode(1000001);
//        list2.next.next=new ListNode(1000002);
//        mergeInLinkedList.mergeInBetween(list1,3,4,list2);
//
//        MergerNodesBetweenZeroes mergerNodesBetweenZeroes=new MergerNodesBetweenZeroes();
//        ListNode l1=new ListNode(0);
//        l1.next=new ListNode(3);
//        l1.next.next=new ListNode(1);
//        l1.next.next.next=new ListNode(0);
//        l1.next.next.next.next=new ListNode(4);
//        l1.next.next.next.next.next=new ListNode(5);
//        l1.next.next.next.next.next.next=new ListNode(2);
//        l1.next.next.next.next.next.next.next=new ListNode(0);
//        l1.next=new ListNode(1);
//        l1.next.next=new ListNode(0);
//        l1.next.next.next=new ListNode(3);
//        l1.next.next.next.next=new ListNode(0);
//        l1.next.next.next.next.next=new ListNode(2);
//        l1.next.next.next.next.next.next=new ListNode(2);
//        l1.next.next.next.next.next.next.next=new ListNode(0);
//        mergerNodesBetweenZeroes.mergeNodes(l1);

//        Maxmin maxmin=new Maxmin();
//        ListNode l1=new ListNode(5);
//        l1.next=new ListNode(3);
//        l1.next.next=new ListNode(1);
//        l1.next.next.next=new ListNode(2);
//        l1.next.next.next.next=new ListNode(5);
//        l1.next.next.next.next.next=new ListNode(1);
//        l1.next.next.next.next.next.next=new ListNode(2);
//        maxmin.nodesBetweenCriticalPoints(l1);

//        RemoveNodesFromLinkedListWithReversing removeNodesFromLinkedList=new RemoveNodesFromLinkedListWithReversing();
//            ListNode l1=new ListNode(5);
//            l1.next=new ListNode(2);
//            l1.next.next=new ListNode(13);
//            l1.next.next.next=new ListNode(3);
//            l1.next.next.next.next=new ListNode(8);
//              removeNodesFromLinkedList.removeNodes(l1);
//        MaxTwinSumOfLinkedList maxTwinSumOfLinkedList=new MaxTwinSumOfLinkedList();
//        ListNode l1=new ListNode(5);
//        l1.next=new ListNode(4);
//        l1.next.next=new ListNode(2);
//        l1.next.next.next=new ListNode(1);
//        maxTwinSumOfLinkedList.pairSum(l1);
//
//        DeleteNodesFRomLinkedListPresentInArray deleteNodesFRomLinkedListPresentInArray=new DeleteNodesFRomLinkedListPresentInArray();
//        ListNode l1=new ListNode(1);
//        l1.next=new ListNode(2);
//        l1.next.next=new ListNode(3);
//        l1.next.next.next=new ListNode(4);
//        l1.next.next.next.next=new ListNode(5);
//        ListNode l1=new ListNode(4);
//        l1.next=new ListNode(4);
//        l1.next.next=new ListNode(5);
//        l1.next.next.next=new ListNode(6);
//        deleteNodesFRomLinkedListPresentInArray.modifiedList(new int[]{4,9},l1);

//        SwappingNodesInALinkedList swappingNodesInALinkedList=new SwappingNodesInALinkedList();
//        ListNode l1=new ListNode(1);
//        l1.next=new ListNode(2);
//        l1.next.next=new ListNode(3);
//        l1.next.next.next=new ListNode(4);
//        l1.next.next.next.next=new ListNode(5);
//        swappingNodesInALinkedList.swapNodes(l1,2);

//        MyLinkedList myLinkedList=new MyLinkedList();
//        myLinkedList.addAtHead(7);
//        myLinkedList.addAtHead(2);
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtIndex(3,0);
//        myLinkedList.deleteAtIndex(2);
//        myLinkedList.addAtHead(4);
//        myLinkedList.addAtTail(4);
//        myLinkedList.get(4);
//        myLinkedList.addAtHead(4);
//        myLinkedList.addAtIndex(5,0);
//        myLinkedList.addAtHead(6);
//        myLinkedList.addAtIndex(0,10);
//        myLinkedList.addAtIndex(0,20);
//        myLinkedList.addAtIndex(1,30);
//        myLinkedList.get(0);
//        myLinkedList.addAtTail(1);
//        myLinkedList.get(0);
//        myLinkedList.deleteAtIndex(0);
//        myLinkedList.addAtHead(86);
//        myLinkedList.addAtIndex(1,54);
//        myLinkedList.addAtIndex(1,14);
//        myLinkedList.addAtHead(83);
//        myLinkedList.deleteAtIndex(4);
//        myLinkedList.addAtIndex(3,18);
//        myLinkedList.addAtHead(46);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtHead(76);
//        myLinkedList.get(5);
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtIndex(1,2);
//        myLinkedList.get(1);
//        myLinkedList.deleteAtIndex(1);
//        myLinkedList.get(1);
//        myLinkedList.addAtIndex(1,0);
//        myLinkedList.get(0);

//        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
//        ListNode l1=new ListNode(8);
//        l1.next=new ListNode(9);
//        l1.next.next=new ListNode(9);
////        l1.next.next.next=new ListNode(3);
//
//        ListNode l2=new ListNode(1);
////        l2.next=new ListNode(9);
////        l2.next.next=new ListNode(4);
//        ListNode newList=addTwoNumbers.addTwoNumbers(l1,l2);
//        while(newList!=null){
//            System.out.println(newList.val);
//            newList=newList.next;
//        }

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
//        swapNodesInPairs.swapPairs(head);
//        SortListUsingArray sortListUsingArray =new SortListUsingArray();
//        ListNode head=new ListNode(4);
//        head.next=new ListNode(2);
//        head.next.next=new ListNode(1);
//        head.next.next.next=new ListNode(3);
//        sortListUsingArray.sortList(head);

//        SortListUsingLinkedList sortListUsingLinkedList =new SortListUsingLinkedList();
//        ListNode head=new ListNode(4);
//        head.next=new ListNode(2);
//        head.next.next=new ListNode(1);
//        head.next.next.next=new ListNode(3);
//        sortListUsingLinkedList.sortList(head);

//        InsertionSortList insertionSortList=new InsertionSortList();
//        ListNode head=new ListNode(4);
//        head.next=new ListNode(2);
//        head.next.next=new ListNode(1);
//        head.next.next.next=new ListNode(3);
//        insertionSortList.insertionSortList(head);

//        RotateList rotateList=new RotateList();
//        ListNode head=new ListNode(1);
//        head.next=new ListNode(2);
//        head.next.next=new ListNode(3);
//        head.next.next.next=new ListNode(4);
//        head.next.next.next.next=new ListNode(5);
//        rotateList.rotateRight(head,2);
//        PartitionList partitionList=new PartitionList();
//        ListNode head=new ListNode(1);
//        head.next=new ListNode(4);
//        head.next.next=new ListNode(3);
//        head.next.next.next=new ListNode(2);
//        head.next.next.next.next=new ListNode(5);
//        head.next.next.next.next.next=new ListNode(2);
//        partitionList.partition(head,3);

//        BrowserHistory desginBrowserHistory=new BrowserHistory("leetcode.com");
//        desginBrowserHistory.visit("google.com");
//        desginBrowserHistory.visit("facebook.com");
//        desginBrowserHistory.visit("youtube.com");
//        System.out.println(desginBrowserHistory.back(1));
//        System.out.println(desginBrowserHistory.back(1));
//        System.out.println(desginBrowserHistory.forward(1));
//        desginBrowserHistory.visit("linkedin.com");
//        System.out.println(desginBrowserHistory.forward(2));
//        System.out.println(desginBrowserHistory.back(2));
//        System.out.println(desginBrowserHistory.back(7));
//        desginBrowserHistory.visit("knit.com");

            SplitIntoParts splitIntoParts=new SplitIntoParts();
            ListNode head=new ListNode(1);
            head.next=new ListNode(2);
            head.next.next=new ListNode(3);
            head.next.next.next=new ListNode(4);
            head.next.next.next.next=new ListNode(5);
            head.next.next.next.next.next=new ListNode(6);
            head.next.next.next.next.next.next=new ListNode(7);
            head.next.next.next.next.next.next.next=new ListNode(8);
            head.next.next.next.next.next.next.next.next=new ListNode(9);
            head.next.next.next.next.next.next.next.next.next=new ListNode(10);
            splitIntoParts.splitListToParts(head,3);

    }
}