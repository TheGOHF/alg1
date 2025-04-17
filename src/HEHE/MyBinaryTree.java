public class MyBinaryTree {
    // создание
    public static BinaryTreeNode createBinaryTree(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        
        BinaryTreeNode root = new BinaryTreeNode(values[0]);
        for (int i = 1; i < values.length; i++) {
            insertNode(root, values[i]);
        }
        return root;
    }

    // добавление нода
    public static void insertNode(BinaryTreeNode root, int value) {
        BinaryTreeNode currentNode = root;
        while (true) {
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = new BinaryTreeNode(value);
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = new BinaryTreeNode(value);
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
    }
