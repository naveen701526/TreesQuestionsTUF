import java.util.*;

public class L10IterativeInOrderTraversalBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(13);
        root.left.right = new Node(15);
        root.right.left = new Node(5);
        root.right.right = new Node(9);
        System.out.println(iterativeInOrderTraversal(root));
        /*
        tree structure:
                      1
                   /     \
                  2       3
                 / \     /  \
               13   15  5    9
         */
    }

    private static List<Integer> iterativeInOrderTraversal(Node root) {
        List<Integer> inOrder = new ArrayList<>();
        if(root==null) return inOrder;
        Stack<Node> stack = new Stack<>();
        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            } else {
                if(stack.isEmpty()) break;
                root = stack.pop();
                inOrder.add(root.data);
                root = root.right;
            }
        }
        return inOrder;
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
