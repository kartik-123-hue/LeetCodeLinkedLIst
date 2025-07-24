public class SortListUsingArray {
    public ListNode sortList(ListNode head) {
      // we apply merge sort
        int n=size(head);
        int[] arr=new int[n];
        ListNode temp=head;
        int i=0;
        while (temp!=null){
            arr[i++]= temp.val;
            temp=temp.next;
        }
        mergeSort(arr,0,n-1);
        ListNode dummy=new ListNode(0);
        ListNode dummyTrav=dummy;
        for(int element:arr){
            dummyTrav.next=new ListNode(element);
            dummyTrav=dummyTrav.next;
        }
        return dummy.next;
    }

    private void mergeSort(int[] arr, int low, int high) {
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public void merge(int[] arr,int low,int mid,int high){
        /*
        To calculate the size of the left and right subarray
        we should the remember the size of an array is (endIndx-startIndx)+1 if we calculate 1,2,3,4 0(startindex) 3(endindex)
        3-0+1=4 thats our size of the array
        now when we divide for left and right sub array
        lets suppse for left we have index as 0(start) and mid (0) and high(1)
        if we want the left sub array that will before mid and mid>low so (mid-low)(0-0)->(this is no subarray with 0 size hence
        we apply the above formula as both are indexes so we have mid-low+1=0-0+1->1(size of the left array)
        and for the right sub array (we have high>mid->(high-mid+1)->it could have been (high-(mid+1)+1) 1 cancls out and remains with
        high-mid
        */

        int m=mid-low+1;
        int n=high-mid;
        int[] left=new int[m];
        int[] right=new int[n];
        for(int i=0;i<m;i++){
            left[i]=arr[low+i];//we do we can low+i is becuase lets suppose our i=0 but our low is at 2 we are the second half our i =0 from main will give
            //us 2 again hence we kept whatever is starting point or low will have the+1 indx it will add that many index in main array also give result
        }
        for(int j=0;j<n;j++){
            right[j]=arr[mid+1+j];
            //same for right sub array starting as the right low is mid+1
        }
        int k=low,i=0,j=0;
        while(i<m && j<n){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=right[j];
            j++;
            k++;
        }
    }

    int size(ListNode head){
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
}
