Problem No:1544
Problem:Make the string great
Solution:
class Solution {
    public String makeGood(String s) {
        char[] stack = new char[s.length()];
        int top = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (top > 0 && Math.abs(stack[top - 1] - c) == 32) {
                top--;
            } else {
                stack[top++] = c;
            }
        }
        return new String(stack, 0, top);
    }
}

Problem No:1475
Problem:Final Prices With a Special Discount in a Shop
Solution:
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            while (top >= 0 && prices[stack[top]] >= prices[i]) {
                prices[stack[top--]] -= prices[i];
            }
            stack[++top] = i;
        }
        return prices;
    }
}
