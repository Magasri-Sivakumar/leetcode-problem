Problem No:507
Problem:Perfect Number
Solution:
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i)
                    sum += num / i;
            }
        }
        return sum == num;
    }
}

Problem No:1103
Problem:Distribute Candies to People
Solution:
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int i = 0;
        while (candies > 0) {
            int give = Math.min(candies, i + 1);
            result[i % num_people] += give;
            candies -= give;
            i++;
        }
        return result;
    }
}
