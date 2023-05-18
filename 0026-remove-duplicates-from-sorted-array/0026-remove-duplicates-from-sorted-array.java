class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

//update: start index from 1, and compare the item with the previous is easier coding