Problem No:1800
Problem:Maximum Ascending Subarray Sum
Solution:
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            }
            else 
            {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}

Problem No:1816
Problem:Truncate Sentence
Solution:
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) 
        {
            ans += words[i];
            if (i < k - 1) 
            {
                ans += " ";
            }
        }
        return ans;
    }
}
