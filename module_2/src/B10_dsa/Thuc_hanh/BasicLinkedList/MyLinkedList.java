package B10_dsa.Thuc_hanh.BasicLinkedList;

public class MyLinkedList {

    private class Node{
        private Node next;
        private Object data;
        public Node(){
            this.data=null;
        }
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }

    private Node head;
    private int numNodes;
    public MyLinkedList(Object data){
        head= new Node(data);
        this.numNodes=1;
    }
    public MyLinkedList(){
        head = new Node();
    }
    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }


    public void add(int index, Object data){
        Node temp =head;
        Node holder;
        for(int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;
        }
        holder = temp.next;
        temp.next= new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = new Node(data);
        temp.next= head;
        head = temp;
        numNodes++;
    }
    public void printList(){
        Node temp = head;
        for(int i =0;i<numNodes;i++){
            System.out.println(temp.data.toString());
            temp=temp.next;
        }
    }
}
