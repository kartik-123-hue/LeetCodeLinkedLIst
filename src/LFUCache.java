import java.util.HashMap;

public class LFUCache {
    int capacity;
    int lfuCount;
    HashMap<Integer,Integer> valMap;
    HashMap<Integer,Integer> countMap;
    HashMap<Integer,DoublyLinkedList> listMap;
    LFUCache(int capacity){
        this.capacity =capacity;
        this.lfuCount=0;
        this.valMap=new HashMap<>();
        this.countMap=new HashMap<>();
        this.listMap=new HashMap<>();
    }

    public int get(int key) {
        if(!this.valMap.containsKey(key)){
            return -1;
        }
        counter(key);
        return this.valMap.get(key);
    }

    public void put(int key, int value) {
        if(this.capacity==0){
            return;
        }
        if(!this.valMap.containsKey(key) && this.valMap.size()==capacity){
            int toRemove=this.listMap.get(lfuCount).popleft();
            this.valMap.remove(toRemove);
            this.countMap.remove(toRemove);
        }
        valMap.put(key,value);
        countMap.putIfAbsent(key,0);
        counter(key);
        lfuCount=Math.min(lfuCount,this.countMap.get(key));
    }
    public void counter(int key){
        int count=this.countMap.get(key);
        countMap.put(key,count+1);
        listMap.putIfAbsent(count,new DoublyLinkedList());
        listMap.get(count).pop(key);

        listMap.putIfAbsent(count+1,new DoublyLinkedList());
        listMap.get(count+1).pushRight(key);
        if(count==lfuCount && this.listMap.get(count).length()==0){
            lfuCount++;
        }
    }
}
