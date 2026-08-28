Problem No:2057
Problem:Smallest Index With Equal Value
Solution:
class Solution {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) 
        {
            if (i % 10 == nums[i])
                return i;
        }
        return -1;
    }
}

Problem No:2078
Problem:Two Furthest Houses With Different Colors
Solution:
class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int ans = 0;
        for (int i = 1; i < n; i++) 
        {
            if (colors[i] != colors[0])
                ans = Math.max(ans, i);
        }
        for (int i = 0; i < n - 1; i++) 
        {
            if (colors[i] != colors[n - 1])
                ans = Math.max(ans, n - 1 - i);
        }
        return ans;
    }
}
