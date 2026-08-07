Problem no:733
Problem :Flood Fill
Solution:
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if (startColor != color) 
        { 
            dfs(image, sr, sc, startColor, color);
        }
        return image;
    }
    private void dfs(int[][] image, int r, int c, int startColor, int color) 
    {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != startColor) 
        {
            return;
        }
        image[r][c] = color;
        dfs(image, r + 1, c, startColor, color);
        dfs(image, r - 1, c, startColor, color);
        dfs(image, r, c + 1, startColor, color);
        dfs(image, r, c - 1, startColor, color);
    }
}

Problem no:744
Problem:Find Smallest Letter Greater than Target
Solution:
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
