package TREE;

public class TreeTraversal {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    static void preorderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    static void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Test the traversal methods
        System.out.print("Inorder traversal: ");
        inorderTraversal(root);
        System.out.println();

        System.out.print("Preorder traversal: ");
        preorderTraversal(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        postorderTraversal(root);
        System.out.println();
    }
}

