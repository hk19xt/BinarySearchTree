package BinarySearchTree;

public class BinarySearchTree {

    private Node root;

    public int maximum(){
        Node temp = root;
        if (root == null){
            throw new ExceptionHandling("The input value is necessary.");
        }

        while(temp.r!=null){
            temp = temp.r;
        }
        return temp.number;
    }



}
