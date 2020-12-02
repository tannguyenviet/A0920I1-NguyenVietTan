package B11_stack_quece.Bai_tap;

import B11_stack_quece.Thuc_hanh.BasicStack.MyGenericStack;

public class CheckBracket {
//    public void splitBracket(String){
//
//    }
    public static void main(String[] args) {
        String st = "s * (s – a) * (s – b) * (s – c)";
        String st2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String st3 = "s * (s – a) * (s – b * (s – c)  ";
        String st4 = "s * (s – a) * s – b) * (s – c)  ";
        String st5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(st+ ": "+checkBracket(st));
        System.out.println(st2+ ": "+checkBracket(st2));
        System.out.println(st3+ ": "+checkBracket(st3));
        System.out.println(st4+ ": "+checkBracket(st4));
        System.out.println(st5+ ": "+checkBracket(st5));

    }
    public static boolean checkBracket(String st) {
        final String LEFT_BRACKET ="(";
        final String RIGHT_BRACKET =")";

        MyGenericStack<String> stack = new MyGenericStack<>();
        String arr[] = st.split("");
        st="";
        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(LEFT_BRACKET) ||arr[i].equals(RIGHT_BRACKET)){
              st+=arr[i];
            }
        }
        arr=st.split("");
        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(LEFT_BRACKET)){
                stack.push(arr[i]);
            }
            else if(arr[i].equals(RIGHT_BRACKET)){
                if(stack.isEmpty()){
                    return false;
                }
                else stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
