Problem no :977
Problem:Squares of a Sorted Array
Solution:
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;
        while (left <= right) 
        {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if (leftSq > rightSq) 
            {
                result[pos] = leftSq;
                left++;
            } 
            else 
            {
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return result;
    }
}

Problem no:1343
Problem:Number of Sub-arrays of Size K and Average Greater than or equal to Threshold
Solution:
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int targetSum = k * threshold;
        int windowSum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) 
        {
            windowSum += arr[i];
        }
        if (windowSum >= targetSum) 
        {
            count++;
        }
        for (int i = k; i < arr.length; i++) 
        {
            windowSum += arr[i] - arr[i - k];
            if (windowSum >= targetSum) count++;
        }
        return count;
    }
}
