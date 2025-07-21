class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }

    public int get(int index) {
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(i==index){
                return temp.val;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        if(head==null){
            head= new Node(val);
            size++;
            return;
        }
        else{
            Node newHead=new Node(val);
            newHead.next=head;
            head=newHead;
            size++;
            return;
        }
    }

    public void addAtTail(int val) {
        if(head==null) {
            head=new Node(val);
            size++;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(val);
            size++;

        }
    }

    public void addAtIndex(int index, int val) {
        if(index==0){
            Node newHead=new Node(val);
            newHead.next=head;
            head=newHead;
            size++;
        }
        else{
            System.out.println("The size of the linked list"+size);
           if(index<size) {
               int i = 0;
               Node temp = head;
               Node prev = null;
               while (temp != null) {
                   if (prev != null && i == index) {
                       Node newNode = new Node(val);
                       prev.next = newNode;
                       newNode.next = temp;
                       size++;
                   }
                   i++;
                   prev = temp;
                   temp = temp.next;
               }
           }else if(head!=null){
               Node temp=head;
               while(temp.next!=null){
                   temp=temp.next;
               }
               temp.next= new Node(val);
               size++;
           }
        }
    }

    public void deleteAtIndex(int index) {
        if(head!=null && index==0){
            Node temp=head;
            temp=temp.next;
            head=temp;
        }
        else{
            int i=0;
            Node temp=head;
            Node prev=null;
            while (temp!=null){
                if(i==index){
                    prev.next=temp.next;
                    size--;
                }
                i++;
                prev=temp;
                temp=temp.next;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */