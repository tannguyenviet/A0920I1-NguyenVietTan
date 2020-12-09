package B10_dsa.Thuc_hanh.BasicLinkedList;

import Inheritance.Thuc_hanh.Circle;
import Inheritance.Thuc_hanh.Rectangle;
import Inheritance.Thuc_hanh.Square;

public class MyLinkedListTest  {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Square square1 = new Square();
        Circle c1 = new Circle();
        MyLinkedList myList = new MyLinkedList();
        myList.add(1,square1);
        myList.add(1,rec1);
        myList.add(1,square1);
        myList.add(1,rec1);
        myList.printList();
        System.out.println(myList.getNumNodes());
        System.out.println("____________________");
        myList.add(3,c1);
        myList.printList();
    }
}
