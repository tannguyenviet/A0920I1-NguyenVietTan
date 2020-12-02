package B10_dsa.Bai_tap.LinkerList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data){
        head = new Node(data);
    };
    static final
     public class Node{
        Node next;
        Object data;
        public Node(){

        }
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        };
    }

    public void add(int index,E element){

    }


}
