Problem No:1967
Problem:Number of Strings That Appear as Substrings in Word
Solution:
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns) {
            if (word.contains(s))
                count++;
        }
        return count;
    }
}

Problem No:1984
Problem:Minimum Difference Between Highest and Lowest of K Scores
Solution:
class Solution {
    public int minimumDifference(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++)
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        return min;
    }
}

Problem No:1909
Problem:Remove One Element to Make the Array Strictly Increasing
Solution:
class Solution {
    public boolean canBeIncreasing(int[] nums) {
      int removed = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                removed++;
                if (removed > 1)
                    return false;
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;  
    }
}

Problem No:1893
Problem:Check if All the Integers in a Range Are Covered
Solution:
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];
        for (int[] r : ranges) {
            diff[r[0]]++;
            diff[r[1] + 1]--;
        }
        int count = 0;
        for (int i = 1; i <= right; i++) {
            count += diff[i];
            if (i >= left && count == 0)
                return false;
        }
        return true;
    }
}
