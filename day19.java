Problem no:1013
Problem:Partition Array Into Three Parts With Equal Sum
Solution:
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int x : arr) {
            total += x;
        }
        if (total % 3 != 0) {
            return false;
        }
        int sum = 0;
        int count = 0;
        int target = total / 3;
        for (int x : arr) {
            sum += x;
            if (sum == target) {
                count++;
                sum = 0;
            }
        }
        return count >= 3;
    }
}

Problem no:989
Problem:Add to Array-Form of Integer
Solution:
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            int sum = k % 10;
            k = k / 10;
            if (i >= 0) {
                sum += num[i];
                i--;
            }
            ans.add(sum % 10);
            k += sum / 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}

Problem no:1389
Problem:Create Target Array in the Given Order
Solution:
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}

Problem no:1431
Problem:Kids With the Greatest Number of Candies
Solution:
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int x : candies) {
            max = Math.max(max, x);
        }
        for (int x : candies) {
            ans.add(x + extraCandies >= max);
        }
        return ans;
    }
}

