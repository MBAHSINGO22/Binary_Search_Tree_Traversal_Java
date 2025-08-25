package PERTEMUAN4;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void add(int x) {
        if (root == null) {
            root = new TreeNode(x);
            return;
        }
        TreeNode bantu = root;
        while (true) {
            if (x < bantu.data) {
                if (bantu.leftNode == null) {
                    bantu.leftNode = new TreeNode(x);
                    return;
                }
                bantu = bantu.leftNode;
                continue;
            }
            if (bantu.rightNode == null) {
                bantu.rightNode = new TreeNode(x);
                return;
            }
            bantu = bantu.rightNode;
        }
    }

    public TreeNode getNode(int key) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (key == bantu.data) {
                return bantu;
            }
            if (key < bantu.data) {
                bantu = bantu.leftNode;
                continue;
            }
            bantu = bantu.rightNode;
        }
        return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preorderTraversal() {
        preorderHelper(root);
    }

    public void inorderTraversal() {
        inorderHelper(root);
    }

    public void postorderTraversal() {
        postorderHelper(root);
    }

    public void preorderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderHelper(node.getLeftNode());
            preorderHelper(node.getRightNode());
        }
    }

    public void inorderHelper(TreeNode node) {
        if (node != null) {
            inorderHelper(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inorderHelper(node.getRightNode());
        }
    }

    public void postorderHelper(TreeNode node) {
        if (node != null) {
            postorderHelper(node.getLeftNode());
            postorderHelper(node.getRightNode());
            System.out.print(node.getData() + " ");
        }
    }
}