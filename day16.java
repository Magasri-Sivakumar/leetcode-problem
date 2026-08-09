Problem no:747
Problem:Largest Number At Least Twice of Others
Solution:
class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != max && nums[max] < 2 * nums[i]) {
                return -1;
            }
        }
        return max;
    }
}

Problem no:746
Problem:Min Cost Climbing Stairs
Solution:
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] = cost[i] + Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 1],cost[cost.length - 2]);
    }
}
