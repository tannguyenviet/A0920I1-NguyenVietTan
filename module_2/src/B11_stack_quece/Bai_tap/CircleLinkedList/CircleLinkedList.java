package B11_stack_quece.Bai_tap.CircleLinkedList;



    public class CircleLinkedList<T>  {
        private Node front;
        private Node rear;
        private int size;

        public Node getFront() {
            return front;
        }

        public void setFront(Node front) {
            this.front = front;
        }

        public Node getRear() {
            return rear;
        }

        public void setRear(Node rear) {
            this.rear = rear;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public CircleLinkedList(){
            this.front = null;
            this.rear = null;
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
           if(this.front==null){
               this.front=this.rear=temp;
           }
           else{
               this.rear.next=temp;
               this.rear = temp;
               temp.next=front;
               this.rear = temp;
           }
            size++;
        }
        public Node dequeue(){
            if(this.rear== null){
                throw new NullPointerException();
            }
            else{
                Node temp = this.front;
                rear.next = this.front.next;
                this.front=this.front.next;
                size--;
                return temp;

            }
        }


    }
