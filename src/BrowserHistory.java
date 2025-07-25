public class BrowserHistory {
    class Node{
        Node prev;
        Node next;
        String url;
        Node(String val){
            this.url=val;
        }
    }
    Node head;
    Node current;
    int size;
    BrowserHistory(String homepage){
        visit(homepage);
        size=0;
    }

    public void visit(String url) {
        if(head==null){
            head=new Node(url);
            current=head;
            update();
        }
        else if (current!=null ){
            Node newNode=new Node(url);
            newNode.prev=current;
            current.next=newNode;
            current=newNode;
            update();
        }
    }
    public void update(){
        int i=0;
        Node temp=head;
        while (temp!=null){
            i++;
            temp=temp.next;
        }
        size=i;
    }

    public String back(int steps) {
        while (current.prev!=null && steps>0){
            current=current.prev;
            steps--;
        }
        return current.url;
    }

    public String forward(int steps) {
      while (current.next!=null && steps>0){
          current=current.next;
          steps--;
      }
      return current.url;
    }
}
