class Solution {
    public int removeDuplicates(int[] nums) {
        
        int p1 = 1;
        int p2 = 1;
        if (nums.length == 1) {
            return p2;
        }
        while (p1 < nums.length) {
            if (nums[p1] == nums[p1 - 1]) {
                p1++;
            }
            else {
                nums[p2++] = nums[p1++];
            }
        }
        return p2;
    }
}