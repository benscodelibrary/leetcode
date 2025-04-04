package Questions;

import DataStructures.BinaryTree;
import DataStructures.TreeNode;

public class RunQuestion {
    public void run1123() {
        int[] arr = { 3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4 };
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.createTree(arr);

        Question1123 question = new Question1123();

        TreeNode result = question.lcsDeepestLeaves(root);

        int[] ans = { 2, 7, 4 };
        TreeNode answer = tree.createTree(ans);
        Boolean match = result.equals(answer);

        System.out.println();
        System.out.println("The input matches the expected output: ");
        tree.BFS(result);
        tree.BFS(answer);
    }
}