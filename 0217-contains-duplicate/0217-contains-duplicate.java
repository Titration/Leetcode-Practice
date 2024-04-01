class Solution {
    public boolean containsDuplicate(int[] nums) {
        /* Approach 1:
        // Arrays.sort(nums);
        // int p = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     if (p == nums[i]) {
        //         return true;
        //     } else {
        //         p = nums[i];
        //     }
        // }
        // return false;
        */
        
        /* Approach 2: HashSet()
        HashSet<Integer> nums_hashset = new HashSet<>();
        for (int num : nums) {
            if (nums_hashset.contains(num)) {
                return true;
            }
            nums_hashset.add(num);
        }
        return false;
        */
        
        /*Approach 3: HashMap()
        */
        HashMap<Integer, Integer> nums_hashmap = new HashMap<>();
        for (int num : nums) {
            if (nums_hashmap.containsKey(num) && nums_hashmap.get(num) >= 1) {
                return true;
            }
            nums_hashmap.put(num, nums_hashmap.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}