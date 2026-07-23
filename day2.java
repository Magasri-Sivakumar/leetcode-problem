Problem no:561
Problem:Array Partition
Solution:
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}

Problem no:506
Problem:Relative Ranks
Solution:
class Solution {
    public String[] findRelativeRanks(int[] score) {
         int n = score.length;
        String[] result = new String[n];
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (score[i] == sorted[j]) {
                    int rank = n - j;
                    if (rank == 1)
                        result[i] = "Gold Medal";
                    else if (rank == 2)
                        result[i] = "Silver Medal";
                    else if (rank == 3)
                        result[i] = "Bronze Medal";
                    else
                        result[i] = String.valueOf(rank);

                    break;
                }
            }
        }
        return result;
    }
}

Problem no:1480
Problem:Running Sum of 1D Array
Solution:
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
