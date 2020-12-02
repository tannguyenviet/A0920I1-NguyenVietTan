package B10_dsa.Bai_tap;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //    public MyList(int capacity){
//        this.size=capacity;
//
//    }
    public void add(E element) {
        if (this.size < DEFAULT_CAPACITY) {
            elements[size++] = element;
        }
    }

    public void add(int index, E element) {
        if (index > DEFAULT_CAPACITY || index < 0) {

            throw new IndexOutOfBoundsException("index: " + index + " Length: " + DEFAULT_CAPACITY);
        } else if (index > DEFAULT_CAPACITY) {
            ensureCapacity(DEFAULT_CAPACITY);
        }
        {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
        }
        this.size++;

    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index: " + index + " Size: " + DEFAULT_CAPACITY);
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
    }

    public boolean contains(E o) {
        for (int i = 0; i <= this.size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i <= this.size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public void printList(){
        for(int i =0;i<this.size;i++){
            System.out.println(elements[i].toString()) ;
        }
    }
}
