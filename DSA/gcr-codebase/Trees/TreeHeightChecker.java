class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class TreeHeightChecker {

    public int height(Node node) {
        if (node == null)
            return -1;

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }
}