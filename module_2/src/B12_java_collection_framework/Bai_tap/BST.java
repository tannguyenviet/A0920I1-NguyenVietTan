//package JavaCollection_Framework.Bai_tap;
//
//import java.util.Comparator;
//import java.util.Objects;
//
//public class BST<E extends Comparator>  extends TreeNode implements Tree<E> {
//    protected TreeNode<E> root;
//    protected int size = 0;
//
//    public BST(Objects obj) {
//        super(obj);
//    }
//
//    public BST(Object o) {
//        super(o);
//    }
//
//    @Override
//    public boolean insert(E e) {
//        TreeNode<E> current = this.root;
//        while(true){
//            if(addValue==current.getElement()){
//                System.out.println("da co gia tri" + current.getElement());
//                break;
//            }
//
//            else if(addValue>current.getElement()){
//                if(current.getRight()==null){
//                    current.setRight(new TreeNode<Integer>(addValue));
//                    System.out.println("Value "+addValue+" added right Node " +current.getElement());
//                    break;
//                }
//                else{
//                    current=current.getRight();
//                }
//            }
//            else{
//                if(current.getLeft()==null){
//                    current.setLeft(new TreeNode<Integer>(addValue));
//                    System.out.println("Value "+addValue+" added left Node" +current.getElement());
//                    break;
//                }
//                else{
//                    current=current.getLeft();
//                }
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public void inorder() {
//
//    }
//
//    @Override
//    public int getSize() {
//        return 0;
//    }
//}
