class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        Map<Integer, Integer> hashmap = new HashMap<>();
        int count = 0;

        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                hashmap.put(sum, hashmap.getOrDefault(sum, 0) + 1);
            }
        }
        for (int k : nums3) {
            for (int l : nums4) {
                int key = 0 - (k + l);
                if (hashmap.containsKey(key)) {
                    count += hashmap.get(key);
                }
            }
        }
        return count;
    }
}