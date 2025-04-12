package Questions.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

// The problem is titled: Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without duplicate characters.

public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> count = new HashMap<>();
        int left = 0, right = 0;

        while (right < s.length() - 1) {
            char x = s.charAt(right);
            count.put(x, count.getOrDefault(x, 0) + 1);

            while (count.get(x) > 1) {
                char remove = s.charAt(left);
                count.put(remove, count.get(remove) - 1);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
            right++;
        }

        return ans;
    }
}
