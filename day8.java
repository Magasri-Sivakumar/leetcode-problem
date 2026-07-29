Problem no:11
Problem : Container With Most Water
Solution:
class Solution {
    public int maxArea(int[] height) {
         int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

Problem no:167
Problem:Two Sum II: Input Array Is Sorted
Solution:
class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}
