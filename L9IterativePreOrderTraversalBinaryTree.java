import java.util.*;

public class L9IterativePreOrderTraversalBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(13);
        root.left.right = new Node(15);
        root.right.left = new Node(5);
        root.right.right = new Node(9);
        System.out.println(iterativePreOrderTraversal(root));
        /*
        tree structure:
                      1
                   /     \
                  2       3
                 / \     /  \
               13   15  5    9
         */
    }

    private static List<Integer> iterativePreOrderTraversal(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        if(root==null) return preOrder;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            preOrder.add(root.data);
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return preOrder;
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
