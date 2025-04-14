package Array;

import java.util.PriorityQueue;

// The problem is titled: Kth Largest Element In An Array

// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Can you solve it without sorting?

public class Question215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int num : nums) {
            queue.add(num);
        }

        for (int i = 1; i < k; i++) {
            queue.poll();
        }

        return queue.poll();
    }
}
