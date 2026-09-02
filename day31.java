Problem no:162
Problem:Find Peak Element
Solution:
class Solution {
    public int findPeakElement(int[] nums) {
       int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1])
                right = mid;
            else
                left = mid + 1;
        }
        return left;  
    }
}

Problem no:204
Problem:Count Primes
Solution:
class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        boolean[] notPrime = new boolean[n];
        for (int i = 2; i * i < n; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i])
                count++;
        }
        return count;
    }
}
