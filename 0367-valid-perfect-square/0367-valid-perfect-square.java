class Solution {
    public boolean isPerfectSquare(int num) {
        
        //binary search
        int l = 1, r = num;
        
        while (l <= r) {
            int mid = l + (r - l)/2;
            //don't use (mid*mid == num), otherwise it will cause timeout
            if (mid == (double)num/mid) { 
                return true;
            }
            else if (mid > (double)num/mid) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return false;
    }
}