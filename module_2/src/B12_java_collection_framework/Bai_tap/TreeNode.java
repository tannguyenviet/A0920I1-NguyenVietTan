package B12_java_collection_framework.Bai_tap;

import java.util.Objects;

public class TreeNode<E> {
    protected E element;
    private TreeNode<E> left;
    private TreeNode<E> right;
    public TreeNode(Objects obj){
        this.element=(E)obj;
    }
    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    public TreeNode(E e){
        this.element=e;
    }


}
