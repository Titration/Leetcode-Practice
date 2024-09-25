// Using two pointers
// Time complexity: O(n)
// Space complexity: O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int left = 0;
        int right = nums.length - 1;

        while (right >= 0 && nums[right] == val) right--; //将right移到从右数第一个值不为val的位置
        
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            }
            left++;
            while (right >= 0 && nums[right] == val) right--;
        }
        
        return left;

    }
}