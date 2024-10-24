class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] result = Arrays.copyOf(nums, nums.length);
        Arrays.sort(result);
        Map<Integer, Integer> hashmap = new HashMap<>();

        //从后向前遍历，这样hash里存放的就是相同元素最左面的数值和下标了
        for (int i = result.length - 1; i >= 0; i--) {
            hashmap.put(result[i], i); 
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = hashmap.get(nums[i]);
        }

        return result;
    }
}