
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import BackTracking.Question40;
import DataStructures.BinaryTree;
import DataStructures.TreeNode;
import Array.Question215;
import Array.Question3375;
import Array.Question3396;
import BinaryTree.Question1123;
import DynamicProgramming.Question368;
import SlidingWindow.Question3;

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

    public void run3() {
        String ex1 = "abcabcbb";
        String ex2 = "bbbbb";
        String ex3 = "pwwkew";

        int ans1 = 3;
        int ans2 = 1;
        int ans3 = 3;

        Question3 question = new Question3();

        int result1 = question.lengthOfLongestSubstring(ex1);
        int result2 = question.lengthOfLongestSubstring(ex2);
        int result3 = question.lengthOfLongestSubstring(ex3);

        System.out.println("The question and answer match for the first call: " + (result1 == ans1));
        System.out.println("The question and answer match for the second call: " + (result2 == ans2));
        System.out.println("The question and answer match for the third call: " + (result3 == ans3));
    }

    public void run215() {
        int[] ex1 = { 3, 2, 1, 5, 6, 4 };
        int[] ex2 = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int[] ex3 = { 9, 7, 5, 3 };

        int k1 = 2;
        int k2 = 4;
        int k3 = 3;

        int ans1 = 5;
        int ans2 = 4;
        int ans3 = 5;

        Question215 question = new Question215();

        int result1 = question.findKthLargest(ex1, k1);
        int result2 = question.findKthLargest(ex2, k2);
        int result3 = question.findKthLargest(ex3, k3);

        System.out.println("The question and answer match for the first call: " + (result1 == ans1));
        System.out.println("The question and answer match for the second call: " + (result2 == ans2));
        System.out.println("The question and answer match for the third call: " + (result3 == ans3));
    }

    public void run40() {
        int[] ex1 = { 1, 2, 3 };
        int[] ex2 = { 10, 1, 2, 7, 6, 1, 5 };
        int[] ex3 = { 2, 5, 2, 1, 2 };

        int target1 = 3;
        int target2 = 8;
        int target3 = 5;

        List<List<Integer>> ans1 = new ArrayList<>();
        List<List<Integer>> ans2 = new ArrayList<>();
        List<List<Integer>> ans3 = new ArrayList<>();

        ans1.add(new ArrayList<>(Arrays.asList(1, 2)));
        ans1.add(new ArrayList<>(Arrays.asList(3)));

        ans2.add(new ArrayList<>(Arrays.asList(1, 1, 6)));
        ans2.add(new ArrayList<>(Arrays.asList(1, 2, 5)));
        ans2.add(new ArrayList<>(Arrays.asList(1, 7)));
        ans2.add(new ArrayList<>(Arrays.asList(2, 6)));

        ans3.add(new ArrayList<>(Arrays.asList(1, 2, 2)));
        ans3.add(new ArrayList<>(Arrays.asList(5)));

        Question40 question = new Question40();

        List<List<Integer>> result1 = question.combinationSum2(ex1, target1);
        // List<List<Integer>> result2 = question.combinationSum2(ex2, target2);
        // List<List<Integer>> result3 = question.combinationSum2(ex3, target3);

        System.out.println("The question and answer match for the first call: " + (result1 == ans1));
        // System.out.println("The question and answer match for the second call: " +
        // (result2 == ans2));
        // System.out.println("The question and answer match for the third call: " +
        // (result3 == ans3));
    }
}