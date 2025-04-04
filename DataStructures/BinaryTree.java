package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
        if (i < arr.length && arr[i] != -1) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public TreeNode createTree(int[] nodes) {
        TreeNode root = insertLevelOrder(nodes, null, 0);
        inOrder(root);
        return root;
    }

    public void BFS(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        List<List<Integer>> answer = new ArrayList<>();

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                row.add(curr.val);

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }

            answer.add(row);
        }

        System.out.println(Arrays.toString(answer.toArray()));
    }
}