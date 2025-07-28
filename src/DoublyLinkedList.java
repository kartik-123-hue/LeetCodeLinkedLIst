import java.util.HashMap;

public class DoublyLinkedList {
    Node left,right;
    HashMap<Integer,Node> map;
    DoublyLinkedList(){
        this.left=new Node(0);
        this.right=new Node(0,this.left,null);
        map=new HashMap<>();
    }
    int length(){
        return this.map.size();
    }
    void pushRight(int key){
       Node newNode=new Node(key,this.right.prev,this.right);
       this.map.put(key,newNode);
       this.right.prev.next=newNode;
       this.right.prev=newNode;
    }

    void pop(int key){
        if(this.map.containsKey(key)){
            Node prev=this.map.get(key).prev;
            Node next=this.map.get(key).next;
            prev.next=next;
            next.prev=prev;
            this.map.remove(key);
        }
    }
    int popleft(){
        int toRemove=this.left.next.val;
        pop(toRemove);
        this.map.remove(toRemove);
        return toRemove;
    }
}
