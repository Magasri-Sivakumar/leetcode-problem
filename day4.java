Problem no: 278
Problem:First Bad Version
Solution:
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

Problem no:704
Problem:Binary Search
Solution:
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) 
            {
                return mid;
            } 
            else if (nums[mid] < target) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}
