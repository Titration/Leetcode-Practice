class Solution {
    public int maximumCount(int[] nums) {
        
        //binary search
        //find the smallest value greater than 0 
        //and find the biggest value smaller than 0
        int positive = 0, negative = 0;
        positive = nums.length - binarySearch1(nums);
        negative = binarySearch2(nums) + 1;
        return positive >= negative ? positive : negative;
    }
    public int binarySearch1(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == 1) {
                r = mid - 1;
            }
            else if (nums[mid] > 1) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return l; //could be the index of first 1; or if 1 doesn't exist,    return the index of the samllest value which is bigger than 1
    }
    public int binarySearch2(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == -1) {
                l = mid + 1;
            }
            else if (nums[mid] > -1) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return r; //could be the index of last -1, or if -1 doesn't exist, return the index of the biggest value which is smaller than -1
    }
}