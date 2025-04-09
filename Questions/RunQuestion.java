package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void run368() {
        int[] ex1 = { 1, 2, 3 };
        int[] ex2 = { 1, 2, 4, 8 };

        List<Integer> ans1 = Arrays.asList(1, 2);
        List<Integer> ans2 = Arrays.asList(1, 2, 4, 8);

        Question368 question = new Question368();

        List<Integer> result1 = question.largestDivisibleSubset(ex1);
        List<Integer> result2 = question.largestDivisibleSubset(ex2);

        System.out.println(ans1.toString());
        System.out.println(result1.toString());
        System.out.println(ans2.toString());
        System.out.println(result2.toString());
        System.out.println("The question and answer match for the first call: " + (result1.equals(ans1)));
        System.out.println("The question and answer match for the second call: " + (result2.equals(ans2)));
    }

    public void run3396() {
        int[] ex1 = { 1, 2, 3, 4, 2, 3, 3, 5, 7 };
        int[] ex2 = { 4, 5, 6, 4, 4 };
        int[] ex3 = { 6, 7, 8, 9 };

        int ans1 = 2;
        int ans2 = 2;
        int ans3 = 0;

        Question3396 question = new Question3396();

        int result1 = question.minimumOperations(ex1);
        int result2 = question.minimumOperations(ex2);
        int result3 = question.minimumOperations(ex3);

        System.out.println("The question and answer match for the first call: " + (result1 == ans1));
        System.out.println("The question and answer match for the second call: " + (result2 == ans2));
        System.out.println("The question and answer match for the third call: " + (result3 == ans3));
    }

    public void run3375() {
        int[] ex1 = { 5, 2, 5, 4, 5 };
        int[] ex2 = { 2, 1, 2 };
        int[] ex3 = { 9, 7, 5, 3 };

        int k1 = 2;
        int k2 = 2;
        int k3 = 1;

        int ans1 = 2;
        int ans2 = -1;
        int ans3 = 4;

        Question3375 question = new Question3375();

        int result1 = question.minOperations(ex1, k1);
        int result2 = question.minOperations(ex2, k2);
        int result3 = question.minOperations(ex3, k3);

        System.out.println("The question and answer match for the first call: " + (result1 == ans1));
        System.out.println("The question and answer match for the second call: " + (result2 == ans2));
        System.out.println("The question and answer match for the third call: " + (result3 == ans3));
    }
}