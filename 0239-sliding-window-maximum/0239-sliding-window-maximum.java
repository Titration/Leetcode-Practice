class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> queue = new LinkedList<>(); // stores index of nums
        int[] res = new int[nums.length - k + 1];
        int idx = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peek() < i - k + 1) {
                queue.poll();
            }
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
                queue.removeLast();
            }

            queue.offer(i);

            if (i >= k - 1) {
                res[idx++] = nums[queue.peek()];
            }
        }
        return res;
    }
}