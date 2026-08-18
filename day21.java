Problem No:1512
Problem:Number of Good Pairs
Solution:
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

Problem No:1534
Problem:Count Good Triplets
Solution:
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                        Math.abs(arr[j] - arr[k]) <= b &&
                        Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

Problem No:1550
Problem:Three Consecutive Odds
Solution:
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 &&
                arr[i + 1] % 2 != 0 &&
                arr[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false; 
    }
}

Problem No:1588
Problem:Sum of All Odd Length Subarrays
Solution:
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if ((j - i + 1) % 2 == 1) {
                    total += sum;
                }
            }
        }
        return total;
    }
}
