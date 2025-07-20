public class Maxmin {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
      int prev_critical_index=0;
        int first_critical_index=0;
        int minDistance=Integer.MAX_VALUE;
        int maxDistance=-1;
        ListNode prev=head;
        ListNode temp=head.next;
        int i=1;
        while(temp!=null && temp.next!=null){
            ListNode next=temp.next;
            if(isCritical(prev,temp,next)){
               if(first_critical_index!=0){
                  maxDistance=i-first_critical_index;
                  minDistance=Math.min(minDistance,i-prev_critical_index);
               }
               else{
                   first_critical_index=i;
               }
                prev_critical_index=i;
            }
            i++;
            prev=temp;
            temp=next;
        }
       if(minDistance==Integer.MAX_VALUE){
           minDistance=-1;
       }
       return new int[]{minDistance,maxDistance};
    }
    public  boolean isCritical(ListNode prev,ListNode curr,ListNode next){
        return (curr.val>prev.val && curr.val>next.val) || (curr.val<prev.val && curr.val<next.val);
    }
}