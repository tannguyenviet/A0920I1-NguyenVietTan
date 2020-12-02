package B10_dsa.Thuc_hanh.BasicList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity(){
        System.out.println("----length*2------ ");
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size == elements.length){
            this.ensureCapacity();
        }
        elements[size++]=e;
    }
    public E get(int index){
        if(index>=size||index<0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E)elements[index];
    }

}
