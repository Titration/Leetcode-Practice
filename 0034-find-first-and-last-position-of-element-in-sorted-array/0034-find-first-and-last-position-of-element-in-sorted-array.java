class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        if (start == -1) return new int[] {-1, -1};
        return new int[] {start, end};
    }
    //binary search
    public int search(int[] nums, int target, boolean isSearchFirst) {
        int l = 0, r = nums.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] > target) {
                r = mid - 1;
            }
            else if (nums[mid] < target) {
                l = mid + 1;
            }
            else { // nums[mid] == target
                index = mid;
                if (isSearchFirst) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return index;
    }
}