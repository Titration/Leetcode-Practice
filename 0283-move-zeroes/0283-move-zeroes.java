class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 1;

        while (p1 < nums.length && p2 < nums.length) {
            if (nums[p1] == 0) {
                if (nums[p2] != 0) {
                    nums[p1] = nums[p2];
                    nums[p2] = 0;
                    p1++;
                }
                p2++;
            }
            else {
                p1++;
                p2++;
            }
        }

    }
}