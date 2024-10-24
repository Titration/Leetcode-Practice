class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            hashmap.put(arr[i], hashmap.getOrDefault(arr[i], 0) + 1);
        }

        // start from 1, bucket stores number of occurrences of existing element
        Set<Integer> hashset = new HashSet<>();
        for (int i : hashmap.values()) {
            if (hashset.contains(i)) {
                return false;
            }
            hashset.add(i);
        }
        return true;
    }
}