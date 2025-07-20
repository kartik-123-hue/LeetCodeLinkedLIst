import java.util.ArrayList;
import java.util.List;

public class Stack {
    ArrayList<Integer> arr;
    int top=-1;
    Stack(){
        arr=new ArrayList<>();
    }

    public void push(int element){
        arr.add(element);
        top++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty no element to remove");
            return -1;
        }
        int elementRemoved= arr.get(top);
        arr.remove(top--);
        return elementRemoved;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
        return arr.get(top);
    }
}
