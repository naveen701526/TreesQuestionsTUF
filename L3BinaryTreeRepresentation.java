public class L3BinaryTreeRepresentation {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(5);
        traverse(root);
        /*
        tree structure:
                    1
                   / \
                  2   3
                     /
                    5
         */
    }
    private static void traverse(Node root){
        if(root == null) return;
        System.out.println(root.data);
        traverse(root.left);
        traverse(root.right);
    }
}


class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }

    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
