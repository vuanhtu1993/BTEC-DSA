package DataStructure;

public class BST_Tree {
    public TreeNode root;

    public BST_Tree() {
        root = null;
    }

    public boolean contains(int value) {
        // Nếu value < node.value tìm kiếm bên trái
        // Nếu value > node.value tìm kiếm bên phải
        // Nếu value == node.value => True
        // Nếu node.value == null => False
        if (root == null) {
            return false;
        } else {
            TreeNode current = root;
            while (true) {
                if (current == null) {
                    return false;
                }
                if (value > current.data) {
                    current = current.right;
                } else if (value < current.data) {
                    current = current.left;
                } else {
                    return true;
                }
            }
        }
    }

    // Container recursive
    public boolean recursiveContain(int value) {
        return recursiveContain(root, value);
    }

    private boolean recursiveContain(TreeNode node, int value) {
        if (node == null) {
            return false;
        } else if (node.data == value) {
            return true;
        }
        if (value > node.data) {
            return recursiveContain(node.right, value);
        } else {
            return recursiveContain(node.left, value);
        }
    }

    // Insert node into tree
    public void insert(int value) {
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
        } else {
            if (value < node.data) {
                node.left = insert(node.left, value);
            } else {
                node.right = insert(node.right, value);
            }
        }
        return node;
    }

    public void print() {
        print(root, "   ");
    }

    private void print(TreeNode node, String indent) {
        if (node != null) {
            print(node.right, indent + "    ");
            System.out.println(indent + node.data);
            print(node.left, indent + "     ");
        }
    }
}
