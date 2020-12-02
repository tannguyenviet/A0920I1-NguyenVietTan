package B11_stack_quece.Bai_tap.CircleLinkedList;

public class CircleLinkedListTest {
    public static void main(String[] args) {
        CircleLinkedList<String> queue = new CircleLinkedList<>();
        queue.enqueue("Hello");
        queue.enqueue("Lai");
        queue.enqueue("La");
        queue.enqueue("Tan");
        queue.enqueue("Dep");
        queue.enqueue("Trai");
        queue.enqueue("Day");
        System.out.println(queue.getRear().next.getKey());
        int size = queue.getSize();
        for(int i =0;i<size;i++){
            System.out.println(queue.dequeue().getKey());
        }

    }

}
