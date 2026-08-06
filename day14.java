Problem no:1732
Problem:Find the Highest Altitude
Solution:
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }
}

Problem no:724
Problem:Find Pivot Index
Solution:
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
