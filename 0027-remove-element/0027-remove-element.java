// Using two for loops
// Time complexity: O(n^2)
// Space complexity: O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < len; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                len--;
            }
        }

        return len;
    }
}