package B11_stack_quece.Bai_tap.Map;
public class Map<T> {
    private  Node head;
    private  Node tail;
    private int size;
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Map(){
        this.head = null;
        this.tail = null;
        this.size =0;
    }

    public  class Node<E>{
        private int key;
        private E data;
        private
        Node next;
        public Node(int key,E data){
            this.key= key;
            this.data=data;
            this.next=null;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }
    }
    public  void enMap(int key,T data){
        if(!hasKey(key)){
            Node temp = new Node(key,data);
            if(this.head==null){
                this.head = this.tail=temp;
            }
            else{

                this.tail.next = temp;
                this.tail = temp;
            }
            size++;
        }
        else{
            System.out.println("This Key: "+key+" has Already");
        }

    }
    public boolean hasKey(int Key){
        if(this.head ==null) return false;
        Node temp = this.head;
        do{
            if(temp.getKey()==Key) return true;
            temp = temp.next;
        }while (temp!=null);
        return false;
    }
    public Node value(int key){
        if(this.tail== null){
            return null;
        }
        else{
            Node temp =this.head ;
            this.head= head.next;
            if(this.head == null){
                this.tail = null;
            }
            for(int i=0;i<this.size-1;i++){
                temp=temp.next;
            }
            this.size--;
            return temp;
        }
    }
    public void printMap(){
        Node temp = this.head;
        do{
            System.out.println("Key: " +temp.key+" Value: "+temp.data);
            temp=temp.next;
        }while (temp!=null);
    }


}
