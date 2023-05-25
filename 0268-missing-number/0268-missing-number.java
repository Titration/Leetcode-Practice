class Solution {
    public int missingNumber(int[] nums) {
        
        //sort + binary search. O(logn)
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] > mid) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return l;
    }
}