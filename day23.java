Problem No:1700
Problem:Number of Students Unable to Eat Lunch
Solution:
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0;
        int one = 0;
        for (int x : students) {
            if (x == 0)
                zero++;
            else
                one++;
        }
        for (int x : sandwiches) {
            if (x == 0) 
            {
                if (zero == 0)
                    return one;
                zero--;
            } 
            else 
            {
                if (one == 0)
                    return zero;
                one--;
            }
        }
        return 0;
    }
}

Problem No:1662
Problem:Check If Two String Arrays are Equivalent
Solution:
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (String s : word1) {
            a += s;
        }
        for (String s : word2) {
            b += s;
        }
        return a.equals(b);
    }
}
