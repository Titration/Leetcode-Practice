class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (hashmap.containsKey(key) && hashmap.get(key) != i) {
                return new int[] {hashmap.get(key), i};
            }
        }
        return new int[] {};
    }
}