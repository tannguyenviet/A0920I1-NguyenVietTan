package B10_dsa.Thuc_hanh.BasicList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(5);
        myList.add(5);
        myList.add(5);
        myList.add(1);
        myList.add(1);
        myList.add(1);
        myList.add(5);
        System.out.println(myList.get(-1));
    }
}
