package B11_stack_quece.Thuc_hanh.BasicStack;

import java.util.EmptyStackException;
import java.util.LinkedList;


public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack= new LinkedList<>();
    }
    public  boolean isEmpty(){
        if(stack.size()==0) return true;
        else return false;
    }
    public void push(T data){
        stack.addFirst(data);
    }

    public T pop(){
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        else return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }

}
