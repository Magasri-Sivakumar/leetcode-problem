Problem No:2016
Problem:Maximum Difference Between Increasing Elements
Solution:
class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int max = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min)
                max = Math.max(max, nums[i] - min);
            else
                min = nums[i];
        }
        return max;
    }
}

Problem No:2022
Problem:Convert 1D Array Into 2D Array
Solution:
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n)
            return new int[0][0];
        int[][] ans = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[index++];
            }
        }
        return ans;
    }
}

Problem No:2032
Problem:Two Out of Three
Solution:
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        for (int x : nums1) a.add(x);
        for (int x : nums2) b.add(x);
        for (int x : nums3) c.add(x);
        Set<Integer> ans = new HashSet<>();
        for (int x : a) {
            if (b.contains(x) || c.contains(x))
                ans.add(x);
        }
        for (int x : b) {
            if (c.contains(x))
                ans.add(x);
        }
        return new ArrayList<>(ans);
    }
}

Problem No:2053
Problem:Kth Distinct String in an Array
Solution:
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> set = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for (String s : arr) {
            if (!set.add(s))
                duplicate.add(s);
        }
        for (String s : arr) {
            if (!duplicate.contains(s) && --k == 0)
                return s;
        }
        return "";
    }
}
