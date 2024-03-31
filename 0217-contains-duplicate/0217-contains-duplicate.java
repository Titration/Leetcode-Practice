class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int p = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (p == nums[i]) {
                return true;
            } else {
                p = nums[i];
            }
        }
        return false;
    }
}