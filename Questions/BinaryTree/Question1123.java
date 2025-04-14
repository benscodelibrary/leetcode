package BinaryTree;

import DataStructures.Pair;
import DataStructures.TreeNode;

// The problem is titled: Lowest Common Ancestor of Deepest Leaves

// The problem statement: Given the root of a binary tree, return the lowest common 
// ancestor of its deepest leaves
public class Question1123 {

    public TreeNode lcsDeepestLeaves(TreeNode root) {
        return dfs(root).getKey();
    }

    public Pair<TreeNode, Integer> dfs(TreeNode root) {
        if (root == null) {
            return new Pair<>(null, 0);
        }

        Pair<TreeNode, Integer> left = dfs(root.left);
        Pair<TreeNode, Integer> right = dfs(root.right);

        if (left.getValue() > right.getValue()) {
            return new Pair<>(left.getKey(), left.getValue() + 1);
        }
        if (left.getValue() < right.getValue()) {
            return new Pair<>(right.getKey(), right.getValue() + 1);
        }

        return new Pair<>(root, left.getValue() + 1);
    }
}