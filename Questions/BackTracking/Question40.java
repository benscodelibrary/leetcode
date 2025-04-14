package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// The problem is titled: Combination Sum II

// Given a collection of candidate numbers (candidates) and a target number (target), 
// find all unique combinations in candidates where the candidate numbers sum to target.

// Each number in candidates may only be used once in the combination.

// Note: The solution set must not contain duplicate combinations.

public class Question40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, ans, new ArrayList<Integer>(), 0);
        return ans;
    }

    public void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> curr, int index) {
        if (target < 0)
            return;
        else if (target == 0) {
            System.out.println("TOTAL LIST" + curr.toString());
            ans.add(new ArrayList<>(curr));
        } else {
            for (int i = index; i < candidates.length && target >= candidates[i]; i++) {
                if (i > index && candidates[i] == candidates[i - 1])
                    continue;
                curr.add(candidates[i]);
                System.out.println(curr.toString());
                backtrack(candidates, target - candidates[i], ans, curr, i + 1);

                curr.remove(curr.size() - 1);
            }
        }

    }
}