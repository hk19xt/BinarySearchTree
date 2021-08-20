package BinarySearchTree;
import java.util.*;

/*This class is main class.
* Users can run this program by inserting values to traversal BST trees
* Author: Hyejin Kim.
* Date: 8/19/2021
* */

public class Testing {

    public static void main(String[] args){


        BinarySearchTree b = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input 10 numbers.");
        System.out.println("1)");
        int input1 = scanner.nextInt();
        BinarySearchTree.insert(input1);
        System.out.println("2)");
        int input2 = scanner.nextInt();
        BinarySearchTree.insert(input2);
        System.out.println("3)");
        int input3 = scanner.nextInt();
        BinarySearchTree.insert(input3);
        System.out.println("4)");
        int input4 = scanner.nextInt();
        BinarySearchTree.insert(input4);
        System.out.println("5)");
        int input5 = scanner.nextInt();
        BinarySearchTree.insert(input5);
        System.out.println("6)");
        int input6 = scanner.nextInt();
        BinarySearchTree.insert(input6);
        System.out.println("7)");
        int input7 = scanner.nextInt();
        BinarySearchTree.insert(input7);
        System.out.println("8)");
        int input8 = scanner.nextInt();
        BinarySearchTree.insert(input8);
        System.out.println("9)");
        int input9 = scanner.nextInt();
        BinarySearchTree.insert(input9);
        System.out.println("10)");
        int input10 = scanner.nextInt();
        BinarySearchTree.insert(input10);

        System.out.println("The minimum number of the tree is: ");
        System.out.println(BinarySearchTree.findMinimum());

        System.out.println("The maximum number of the tree is: ");
        System.out.println(BinarySearchTree.findMaximum());

        System.out.println("The pre-order tree is: ");
        BinarySearchTree.pre_order_tree();

        System.out.println();
        System.out.println("The in-order tree is: ");
        BinarySearchTree.in_order_tree();

        System.out.println();
        System.out.println("The post-order tree is: ");
        BinarySearchTree.post_order_tree();

        System.out.println();
        System.out.println("Enter the number you would like to delete.");
        int input12 = scanner.nextInt();
        BinarySearchTree.deleteNumber(input12);
        System.out.println("After deleting the number " + input12 + ", the in-order tree is: ");
        BinarySearchTree.in_order_tree();


    }
}
