Problem No:1646
Problem:Get Maximum in Generated Array
Solution:
class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) 
        {
            if (i % 2 == 0) 
            {
                nums[i] = nums[i / 2];
            } else 
            {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}

Problem No:1652
Problem:Defuse the Bomb
Solution:
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) 
        {
            return ans;
        }
        for (int i = 0; i < n; i++)
        {

            if (k > 0) 
            {
                for (int j = 1; j <= k; j++) 
                {
                    ans[i] += code[(i + j) % n];
                }
            } 
            else 
            {
                for (int j = 1; j <= -k; j++) 
                {
                    ans[i] += code[(i - j + n) % n];
                }
            }
        }
        return ans;
    }
}
