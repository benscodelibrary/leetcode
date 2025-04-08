package Questions;

// The problem is titled: Minimum Number of Operations to Make Elements in Array Distinct

// The problem statement: You are given an integer array nums. You need to ensure that 
// the elements in the array are distinct. To achieve this, you can perform the following 
// operation any number of times:

// Remove 3 elements from the beginning of the array. If the array has fewer than 3 
// elements, remove all remaining elements.
public class Question3396 {
    public int minimumOperations(int[] nums) {
        boolean[] seen = new boolean[100];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (seen[nums[i]] == true) {
                return i / 3 + 1;
            }
            seen[nums[i]] = true;
        }

        return 0;
    }
}
