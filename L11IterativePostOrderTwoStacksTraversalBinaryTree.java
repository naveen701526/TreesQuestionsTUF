import java.util.*;

public class L11IterativePostOrderTwoStacksTraversalBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(13);
        root.left.right = new Node(15);
        root.right.left = new Node(5);
        root.right.right = new Node(9);
        System.out.println(iterativePostOrderTwoStacksTraversal(root));
        /*
        tree structure:
                      1
                   /     \
                  2       3
                 / \     /  \
               13   15  5    9
         */
    }

    private static List<Integer> iterativePostOrderTwoStacksTraversal(Node root) {
        List<Integer> postOrder = new ArrayList<>();
        if(root==null) return postOrder;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            root = stack1.pop();
            stack2.push(root);
            if(root.left != null) stack1.push(root.left);
            if(root.right != null) stack1.push(root.right);
        }
        while(!stack2.isEmpty()){
            postOrder.add(stack2.pop()
                    .data);
        }


        return postOrder;
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
