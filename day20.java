Problem No:1450
Problem:Number of Students Doing Homework at a Given Time
Solution:
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }
}

Problem No:1460
Problem:Make Two Arrays Equal by Reversing Subarrays
Solution:
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}

Problem No:1051
Problem:Height Checker
Solution:
class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }
        return count;
    }
}

Problem No:1089
Problem:Duplicate Zeros
Solution:
class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] == 0) 
            {
                for (int j = arr.length - 1; j > i; j--) 
                {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}

Problem No:1184
Problem:Distance Between Bus Stops
Solution:
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int path = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
        }
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        for (int i = start; i < destination; i++) {
            path += distance[i];
        }
        return Math.min(path, total - path);
    }
}

Problem No:1207
Problem:Unique Number of Occurrences
Solution:
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int count : map.values()) {
            if (!set.add(count)) {
                return false;
            }
        }
        return true;
    }
}
