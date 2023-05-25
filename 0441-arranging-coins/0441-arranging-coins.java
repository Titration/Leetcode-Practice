class Solution {
    public int arrangeCoins(int n) {
        //binary search
        long l = 1, r = n, ans = 0;

        while (l <= r) {
            long mid = l + (r-l)/2;
            if ((1+mid)*mid/2 <= n) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return (int)ans;
    }
}