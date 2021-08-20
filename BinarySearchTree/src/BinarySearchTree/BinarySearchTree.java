package BinarySearchTree;

/*This class is creating a binary search tree (BST).
  The BST includes 1) in-order, 2) pre-order, and 3) post-order traversal trees.
*/

public class BinarySearchTree {

    private Node root;

    //This method is to insert new number input by users.
    private void insert(int number){
        root = insertToTree(root, number);
    }//insert

    //This method is inserting the number to a tree.
    private Node insertToTree(Node root, int number){
        Node newTree; //To make subtrees.
        if(root==null){
            return new Node(number);
        }
        if(number<root.number) { //left subtrees
            newTree = insertToTree(root.l, number);
            root.l = newTree;
            return root;
        }else if (number>root.number) { //right subtrees
            newTree = insertToTree(root.r, number);
            root.r = newTree;
            return root;
        }else{ //If the number already exist in the tree, then it occurs exception handling.
            throw new ExceptionHandling("Please enter the different number.");
        }

    }//insertToTree

    //This method is comparing two values recursively.
    private Node compare(Node root, int number) {
        if (root == null || root.number == number) {
            return root;
        } else {
            if (number < root.number) { //If the user's number is smaller than root's number,
                return compare(root.l, number); //then, go to the left subtree.
            }
                return compare(root.r, number); //otherwise, go to the right subtree.
        }
    }//compare

    //This method is to start the comparision between the numbers of nodes.
    public Node compareStart(int number){
        return compare(root, number);
    }//compareStart

    //This method is to find the maximum number of the tree (Rightmost number).
    public int findMaximum(){
        Node temp = root;
        if (root == null){
            throw new ExceptionHandling("The input value is necessary.");
        }

        while(temp.r!=null){
            temp = temp.r;
        }
        return temp.number;
    }//findMaximum

    //This method is to find the minimum number of the tree (Leftmost number).
    public int findMinimum(){
        Node temp2 = root;
        if (root==null){
            throw new ExceptionHandling("The inpub value is needed.");
        }
        while(temp2.l!=null){
            temp2=temp2.l;
        }
        return temp2.number;
    }//findMinimum

    //This method is an in-order traversal of the tree.
    public void in_order_tree(){
        inorder(root);
    }//in_order_tree

    //This method is in-order traversal. (left->root->right)
    private void inorder(Node root){
        if(root!=null){
            inorder(root.l);
            System.out.println(root.number);
            inorder(root.r);
        }
    }//inorder

    //This method is a pre-order traversal of the tree.
    public void pre_order_tree(){
        preorder(root);
    }//pre_order_tree

    //This method is pre-order traversal. (root->left->right)
    //Top to bottom.
    private void preorder(Node root){
        if(root!=null){
            System.out.println(root.number);
            preorder(root.l);
            preorder(root.r);
        }
    }//preorder

    //This method is a post-order traversal of the tree.
    public void post_order_tree(){
        postorder(root);
    }//postorder

    //This method is post-order traversal. (left->right->root)
    //Bottom to top.
    private void postorder(Node root){
        if(root!=null){
            postorder(root.l);
            postorder(root.r);
            System.out.println(root.number);
        }
    }//postorder

    //This method is to delete a root's number.
    public void deleteNumber(int number){
        root = deletedTree(root, number);
    }//deleteNumber

    //This method is searching the tree in order to delete the user's number.
    private Node deletedTree(Node root, int number){
        Node newTree;
        if(root==null){
            throw new ExceptionHandling("It is an empty tree.");
        }
        if(number==root.number){ //If the user's number is equal to the root's number,
            root = delete(root); //Then delete the root.
            return root;
        }
        else if(number<root.number){ //If the user's number is smaller than root's number
            newTree = deletedTree(root.l, number);//then, go to the left subtree.
            root.l = newTree;
            return root;
        }else{
            newTree = deletedTree(root.r, number); //Otherwise, go to the right subtree.
            root.l = newTree;
            return root;
        }
    }//deletedTree

    //This method is actually deleting a root existed in the tree.
    private Node delete(Node root){
        if(root.r==null && root.l==null){ //When there's only one root existed.
            return null;
        }
        if(root.r==null){ //When there is only one left node in the tree.
            return root.l;
        }else if(root.l==null){ //When there is only one right node in the tree.
            return root.r;
        }else { //When there are two children in the tree.
            int newNumber = rightMostNode(root.l);
            root.number = newNumber;
            root.l = deleteRightMost(root.l);
            return root;
        }
    }//delete

    //This method is deleting the right-most node in the subtree.
    private Node deleteRightMost(Node root){
        if(root.r==null){
            return root.l;
        }
        root.r = deleteRightMost(root.r);
        return root;
    }//deleteRightMost

  //This method is to find the right-most node in the tree.
    private int rightMostNode(Node root){
        if(root.r==null){ //When there is not right node anymore, then it is the right-most node.
            return root.number;
        }
        return rightMostNode(root.r);
    }//rightMost
  
}
