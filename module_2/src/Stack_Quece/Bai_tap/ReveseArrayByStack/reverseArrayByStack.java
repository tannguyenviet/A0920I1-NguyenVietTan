package Stack_Quece.Bai_tap.ReveseArrayByStack;


import Stack_Quece.Thuc_hanh.BasicStack.MyGenericStack;

import java.util.Arrays;

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
