class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class FolderDeletion {

    public void deleteFolderTree(Node node) {
        if (node == null)
            return;

        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node);
    }

    private void deleteNode(Node node) {
        System.out.println(node.val);
    }
}