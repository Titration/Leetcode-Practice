class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        
        for (int i=0; i<nums.length; i++) {
            if (i+1 < nums.length && nums[i] == nums[i+1]) {
            }
            else if (i+1 < nums.length && nums[i] != nums[i+1]) {
                nums[k] = nums[i+1];
                k++;
                continue;
            }
        }
        return k;
    }
}