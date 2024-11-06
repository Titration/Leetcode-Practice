class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> hashmap = new HashMap<>();
        ArrayList<Integer>[] array = new ArrayList[nums.length + 1];
        int count = 0;
        int[] result = new int[k];

        for (int key : nums) {
            hashmap.put(key, hashmap.getOrDefault(key, 0) + 1);
        }
        
        for (int key : hashmap.keySet()) {
            int value = hashmap.get(key);
            if (array[value] == null) {
                array[value] = new ArrayList<>();
            }
            array[value].add(key);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null) {
                for (int j = 0; j < array[i].size() && count < k; j++) {
                    result[count] = array[i].get(j);
                    count++;
                }
            }
            
        }
        return result;
    }
}