Problem no:905
Problem:Sort Array By Parity
Solution:
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) {
                left++;
            }
            if (nums[right] % 2 == 1) {
                right--;
            }
        }
        return nums;
    }
}

Problem no:908
Problem:Smallest Range I
Solution:
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) 
        {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }        
        return Math.max(0, max - min - 2 * k);
    }
}
