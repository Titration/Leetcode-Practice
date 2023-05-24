class Solution {
    public int mySqrt(int x) {
        //binary search
        int l = 1, r = x;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (mid == (double)x/mid) {
                return mid;
            }
            else if (mid > (double)x/mid){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return l-1;
    }
}