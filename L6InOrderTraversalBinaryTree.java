public class L6InOrderTraversalBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(13);
        root.left.right = new Node(15);
        root.right.left = new Node(5);
        root.right.right = new Node(9);
        inOrderTraversal(root);
        /*
        tree structure:
                      1
                   /     \
                  2       3
                 / \     /  \
               13   15  5    9
         */
    }

    private static void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
}


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
