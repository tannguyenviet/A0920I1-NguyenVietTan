package B11_stack_quece.Bai_tap.DemergingQueue;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class TestDemergingQueue {
    public static void main(String[] args) {
        Stack<Employee> nam = new Stack<>();
        Stack<Employee> nu  = new Stack<>();
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
