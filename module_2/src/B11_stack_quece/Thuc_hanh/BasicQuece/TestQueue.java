package B11_stack_quece.Thuc_hanh.BasicQuece;

public class TestQueue  {
    public static void main(String[] args) {
        MyLinkedListQuece<String> queue = new MyLinkedListQuece<>();
        queue.enqueue("hello");
        queue.enqueue("Tui");
        queue.enqueue("La");
        queue.enqueue("Tan");
        queue.enqueue("DepTrai");
        queue.enqueue("Rat dep trai moi dung");
        int size = queue.getSize();
        for(int i =0;i<size;i++){
            System.out.println(queue.dequeue().getKey());
        }
    }
}
