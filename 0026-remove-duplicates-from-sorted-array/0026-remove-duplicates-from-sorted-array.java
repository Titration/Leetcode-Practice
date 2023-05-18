class Solution {
    public int removeDuplicates(int[] nums) {
        
        int cout_dup = 0;
        int k = 1;
        
        for (int i=0; i<nums.length; i++) {
            if (i+1 < nums.length && nums[i] == nums[i+1]) {
                cout_dup++;
            }
            else if (i+1 < nums.length && nums[i] != nums[i+1]) {
                nums[k] = nums[i+1];
                k++;
                cout_dup = 0;
                continue;
            }
        }
        return k;
    }
}