package B12_java_collection_framework.Bai_tap;

public class TestTreeNode {

    public static void main(String[] args) {
             TreeNode<Integer> root = new TreeNode<>(100);
            root.setLeft(new TreeNode<>(60));
            root.setRight(new TreeNode<>(120));
            root.getLeft().setLeft(new TreeNode<>(52));
            root.getLeft().setRight(new TreeNode<>(67));
            root.getRight().setLeft(new TreeNode<>(115));
            root.getRight().setRight(new TreeNode<>(130));
            addTreeNode(116,root);
            addTreeNode(123,root);
            searchValue(124,root);

    }
    public static void addTreeNode(int addValue,TreeNode<Integer> root){
        TreeNode<Integer> current = root;
        while(true){
            if(addValue==current.getElement()){
                System.out.println("da co gia tri" + current.getElement());
                break;
            }

            else if(addValue>current.getElement()){
                if(current.getRight()==null){
                    current.setRight(new TreeNode<Integer>(addValue));
                    System.out.println("Value "+addValue+" added right Node " +current.getElement());
                    break;
                }
                else{
                    current=current.getRight();
                }
            }
            else{
                if(current.getLeft()==null){
                    current.setLeft(new TreeNode<Integer>(addValue));
                    System.out.println("Value "+addValue+" added left Node" +current.getElement());
                    break;
                }
                else{
                    current=current.getLeft();
                }
            }
        }

    }
    public static void searchValue(int value,TreeNode<Integer> root){
        TreeNode<Integer> current = root;

        while(true){
            if(value==current.getElement()){
                System.out.println("There is value "+value+" in Tree Node");
                break;
            }
            if(value>current.getElement()){
                if(current.getRight()==null){
                    System.out.println("There is NOO value "+value+" in Tree Node");
                    break;
                }
                else{
                    current=current.getRight();
                }
            }
            else if(value<current.getElement()){
                if(current.getLeft()==null){
                    System.out.println("There is NOO value "+current.getElement()+"in Tree Node");
                    break;
                }
                else{
                    current=current.getLeft();
                }
            }
        }
    }
}
