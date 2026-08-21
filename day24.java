Problem No:1748
Problem:Sum of Unique Elements
Solution:
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for (int x : nums) 
        {
            count[x]++;
        }
        int sum = 0;
        for (int i = 0; i < count.length; i++) 
        {
            if (count[i] == 1) 
            {
                sum += i;
            }
        }
        return sum;
    }
}

Problem No:1752
Problem:Check if Array Is Sorted and Rotated
Solution:
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] > nums[(i + 1) % nums.length]) 
            {
                count++;
            }
        }
        return count <= 1;
    }
}
