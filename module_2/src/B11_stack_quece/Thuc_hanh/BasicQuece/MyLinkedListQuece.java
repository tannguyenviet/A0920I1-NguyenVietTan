package B11_stack_quece.Thuc_hanh.BasicQuece;

public class MyLinkedListQuece<T>  {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyLinkedListQuece(){
        this.head = null;
        this.tail = null;
        this.size =0;
    }

    public  class Node<E>{
        private E key;
        Node next;
        public Node(E key){
            this.key= key;
        }

        public E getKey() {
            return key;
        }

        public void setKey(E key) {
            this.key = key;
        }
    }
    public  void enqueue(T data){
        Node temp = new Node(data);
        if(this.head == null){
            this.head = this.tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public  Node dequeue(){
        if(this.tail== null){
            throw new NullPointerException();
        }
        else{
            Node temp = this.           head;
            this.head= head.next;
            if(this.head == null){
                this.tail = null;
            }
            this.size--;
            return temp;

        }
    }


}
