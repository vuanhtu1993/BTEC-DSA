import DataStructure.Tree;
import DataStructure.TreeNode;

public class App {
    public static void main(String[] args) throws Exception {
        Tree myTree = new Tree(29);
        // myTree.root
        TreeNode node2 = new TreeNode(41);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(17);
        TreeNode node5 = new TreeNode(81);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(40);
        myTree.root.left = node2;
        myTree.root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        System.out.println(myTree);
    }
}
