package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// The problem is titled: Largest Divisible Subset

// Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:

// answer[i] % answer[j] == 0, or
// answer[j] % answer[i] == 0
// If there are multiple solutions, return any of them.

public class Question368 {

    public Map<Integer, List<Integer>> dpMap;
    int[] numbers = {};

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int size = nums.length;
        if (size == 0)
            return new ArrayList<>();

        Arrays.sort(nums);

        numbers = nums;
        dpMap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            List<Integer> curr = dp(i);
            if (ans.size() < curr.size())
                ans = curr;
        }

        return ans;
    }

    public List<Integer> dp(int num) {
        if (dpMap.containsKey(num))
            return dpMap.get(num);

        List<Integer> maxSubset = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if (numbers[num] % numbers[i] == 0) {
                List<Integer> found = dp(i);
                if (found.size() > maxSubset.size())
                    maxSubset = found;
            }
        }

        List<Integer> newEntry = new ArrayList<>();
        newEntry.addAll(maxSubset);
        newEntry.add(numbers[num]);

        dpMap.put(num, newEntry);
        return newEntry;
    }
}
