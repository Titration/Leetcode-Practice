class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) { return false; }

        int temp = x;
        int reserved = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reserved = reserved * 10 + digit;
            temp = temp / 10;
        }
        
        return (reserved == x);
    }
}