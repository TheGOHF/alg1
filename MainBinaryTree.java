import HEHE.MyBinaryTree;
import HEHE.BinaryTreeNode;


public class MainBinaryTree {
    public static void printBinaryTree(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }    
    public static void main(String[] args) {
        int[] values = {10, 5, 15, 2, 7, 12, 17};
        BinaryTreeNode root = createBinaryTree(values);
        printBinaryTree(root);
    
}
    }
}
