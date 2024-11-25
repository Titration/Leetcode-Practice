class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> hashmap = new HashMap<>();
        // Min heap
        Queue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair1[1] - pair2[1]);
        int[] result = new int[k];

        for (int key : nums) {
            hashmap.put(key, hashmap.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (pq.size() < k) {
                pq.add(new int[] {entry.getKey(), entry.getValue()});
            }
            else {
                if (entry.getValue() > pq.peek()[1]) {
                    pq.poll();
                    pq.add(new int[] {entry.getKey(), entry.getValue()});
                }
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }

        return result;
    }
}