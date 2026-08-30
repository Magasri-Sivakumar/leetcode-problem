Problem No:2108
Problem:Find First Palindromic String in the Array
Solution:
class Solution {
    public String firstPalindrome(String[] words) {
         for (String s : words) {
            int i = 0;
            int j = s.length() - 1;
            while (i < j && s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            if (i >= j)
                return s;
        }
        return "";
    }
}

Problem No:2085
Problem:Count Common Words With One Occurrence
Solution:
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        for (int i = 0; i < words1.length; i++) {
            boolean unique1 = true;
            for (int j = 0; j < words1.length; j++) {
                if (i != j && words1[i].equals(words1[j])) {
                    unique1 = false;
                    break;
                }
            }
            if (!unique1)
                continue;
            int occurrences = 0;
            for (String s : words2) {
                if (words1[i].equals(s)) {
                    occurrences++;
                    if (occurrences > 1)
                        break;
                }
            }
            if (occurrences == 1)
                count++;
        }
        return count;
    }
}
