class Solution {
    public int removeElement(int[] nums, int val) {
        
        int p1 = 0, k = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                if (p1 != k) {
                    nums[k] = nums[p1];
                }
                p1++;
                k++;
            }
            else {
                p1++;
            }
        }
        return k;
    }
}