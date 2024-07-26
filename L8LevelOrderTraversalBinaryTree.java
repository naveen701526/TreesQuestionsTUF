import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L8LevelOrderTraversalBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(13);
        root.left.right = new Node(15);
        root.right.left = new Node(5);
        root.right.right = new Node(9);
        System.out.println(levelOrderTraversal(root));
        /*
        tree structure:
                      1
                   /     \
                  2       3
                 / \     /  \
               13   15  5    9
         */
    }

    private static List<List<Integer>> levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i = 0; i<levelSize;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                levelNodes.add(queue.poll().data);
            }
            result.add(levelNodes);
        }
        return result;
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
