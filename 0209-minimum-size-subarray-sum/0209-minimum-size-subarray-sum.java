class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }

        int left = 0, right = 0, sum = 0, minLength = nums.length + 1;
        
        while (right < nums.length) {
            sum += nums[right];    
            while (sum >= target) {
                if (minLength >= right -left + 1) {
                    minLength = right - left + 1;
                }
                //shrink window
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLength == nums.length + 1 ? 0 : minLength;
    }
}