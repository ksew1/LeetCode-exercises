class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return reverseNumber(x) == x;


        
    }
    private int reverseNumber(int x) {
        int result = 0;
        while (x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return result;

    }
}