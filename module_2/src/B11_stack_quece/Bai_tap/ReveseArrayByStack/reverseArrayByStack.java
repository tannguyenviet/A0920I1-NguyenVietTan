package B11_stack_quece.Bai_tap.ReveseArrayByStack;


import B11_stack_quece.Thuc_hanh.BasicStack.MyGenericStack;

public class reverseArrayByStack {
    public static void main(String[] args) {
        int arr[]  = new int[10];
        for(int i =0;i<10;i++){
            arr[i]=i;
        }
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        for(int i =0;i<10;i++){
            stack.push(arr[i]);
        }
        for(int i =0;i<10;i++){
            System.out.println(stack.pop());
        }
    }

}
