Problem No:300
Problem:Longest Increasing Subsequence
Solution:
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int num : nums) {
            int left = 0;
            int right = size;
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (tails[mid] < num)
                    left = mid + 1;
                else
                    right = mid;
            }
            tails[left] = num;
            if (left == size)
                size++;
        }
        return size;
    }
}

Problem No:198
Problem:House Robber
Solution:
class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}

Problem No:413
Problem:Arithmetic Slices
Solution:
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int current = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                current++;
                count += current;
            } else {
                current = 0;
            }
        }
        return count; 
    }
}

Problem No:416
Problem:Partition Equal Subset Sum
Solution:
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        if (sum % 2 != 0)
            return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) 
        {
            for (int j = target; j >= num; j--) 
            {
                if (dp[j - num])
                    dp[j] = true;
            }
        }
        return dp[target];
    }
}

Problem No:215
Problem:Kth Largest Element in an Array
Solution:
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
