Problem No:1991
Problem:Find the Middle Index in Array
Solution:
class Solution {
    public int findMiddleIndex(int[] nums) {
        int total = 0;
        for (int n : nums)
            total += n;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i])
                return i;
            left += nums[i];
        }
        return -1;
    }
}

Problem No:2006
Problem:Count Number of Pairs With Absolute Difference K
Solution:
class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] freq = new int[101];
        int count = 0;
        for (int n : nums) {
            if (n + k <= 100)
                count += freq[n + k];
            if (n - k >= 1)
                count += freq[n - k];
            freq[n]++;
        }
        return count;
    }
}
