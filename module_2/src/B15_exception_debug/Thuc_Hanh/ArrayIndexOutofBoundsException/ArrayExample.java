package B15_exception_debug.Thuc_Hanh.ArrayIndexOutofBoundsException;

public class ArrayExample  {
    public  Integer[] createArray(){
        Integer[] arr = new Integer[100];
        for(int i =0;i<arr.length;i++){
            arr[i]=(int) (Math.random()*100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }
    public ArrayExample(){
        createArray();
    }

}
