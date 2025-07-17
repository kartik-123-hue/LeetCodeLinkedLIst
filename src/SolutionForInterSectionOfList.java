public class SolutionForInterSectionOfList {
    public  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeOfA = getLengthOfLinkedList(headA);
        int sizeOfB = getLengthOfLinkedList(headB);
        ListNode tempA = headA;
        ListNode tempB = headB;
        if (sizeOfA > sizeOfB) {
            int numberOfNodesToMove = sizeOfA - sizeOfB;
            for (int i = 0; i < numberOfNodesToMove; i++) {
                tempA = tempA.next;
            }
            while (tempA != null && tempB != null) {
                if (tempA== tempB) {
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }
        } else if (sizeOfB > sizeOfA) {
            int numberOfNodesToMove = -1 * (sizeOfA - sizeOfB);

            for (int i = 0; i < numberOfNodesToMove; i++) {
                tempB = tempB.next;
            }
            while (tempA != null && tempB != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }
        } else {
            while (tempA != null && tempB != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }
        }
        return null;
    }


    private  int getLengthOfLinkedList(ListNode head) {
        int length=0;
        ListNode temp=head;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
}
