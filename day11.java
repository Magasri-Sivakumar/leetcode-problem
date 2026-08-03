Problem no:152
Problem:Maximum Product Subarray
Solution:
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}

Problem no:674
Problem:Longest Continuous Increasing Subsequence
Solution:
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
            {
                currentLength++;
            } 
            else 
            {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
