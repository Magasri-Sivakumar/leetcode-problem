Problem no:697
Problem:Degree of an Array
Solution:
class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50001];
        int[] first = new int[50001];
        int[] last = new int[50001];
        for (int i = 0; i < first.length; i++) {
            first[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count[num]++;
            if (first[num] == -1) {
                first[num] = i;
            }
            last[num] = i;
        }
        int degree = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > degree) {
                degree = count[i];
            }
        }
        int answer = nums.length;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == degree) {
                int length = last[i] - first[i] + 1;
                if (length < answer) {
                    answer = length;
                }
            }
        }
        return answer;
    }
}

Problem no:705
Problem:Design HashSet
Solution:
class MyHashSet {
     boolean[] set;
    public MyHashSet() {
        set = new boolean[1000001];
    }
    public void add(int key) {
        set[key] = true;
    }
    public void remove(int key) {
        set[key] = false;
    }
    public boolean contains(int key) {
        return set[key];
    }
}
