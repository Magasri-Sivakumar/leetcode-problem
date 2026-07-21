Problem no: 1
Problem : Two Sum
Solution:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

Problem no: 2
Problem :Add Two numbers
Solution:
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
}

Problem no : 3
Problem:Longest Substring Without Repeating Characters
Solution:
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1;
            }
            lastIndex[ch] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
