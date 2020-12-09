package B10_dsa.Bai_tap;

import Inheritance.Thuc_hanh.Rectangle;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Rectangle> myList = new MyList<>();
        Rectangle r1= new Rectangle(3.3,4.5);
        Rectangle r2 = new Rectangle(2.2,2.5);
        Rectangle r3 = new Rectangle(1.1,3.3);
        myList.add(r2);
        myList.add(r1);
        myList.add(1,r3);
        myList.printList();
        Rectangle rCompare= new Rectangle(1.1,3.3);
        System.out.println( myList.indexOf(rCompare))  ;
    }
}
