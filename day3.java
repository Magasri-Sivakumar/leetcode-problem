Problem no : 74
Problem : Search a 2D Matrix
Solution:
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows * cols - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int value = matrix[mid / cols][mid % cols];
            if (value == target) {
                return true;
            } else if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

Problem no : 75
Problem : Sort Colors
Solution :
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int num : nums) {
            if (num == 0)
                zero++;
            else if (num == 1)
                one++;
            else
                two++;
        }
        int index = 0;
        while (zero-- > 0)
            nums[index++] = 0;
        while (one-- > 0)
            nums[index++] = 1;
        while (two-- > 0)
            nums[index++] = 2;
    }
}
