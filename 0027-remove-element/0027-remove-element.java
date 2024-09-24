// Using slow & faster pointers
// Time complexity: O(n)
// Space complexity: O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}