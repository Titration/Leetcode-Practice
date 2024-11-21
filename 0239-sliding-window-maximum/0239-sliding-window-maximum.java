class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Myqueue myQueue = new Myqueue();
        int[] result = new int[nums.length - k + 1];
        int index = 0;

        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        result[index++] = myQueue.peek(); 
        for (int i = k; i < nums.length; i++) {
            myQueue.poll(nums[i - k]);
            myQueue.add(nums[i]);
            result[index++] = myQueue.peek();
        }
        return result;
    }
}

class Myqueue {
    Deque<Integer> deque = new LinkedList<>();
    
    void poll(int value) {
        if (!deque.isEmpty() && deque.peek() == value) {
            deque.poll();
        }
    }

    void add(int value) {
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.removeLast();
        }
        deque.add(value);
    }

    int peek() {
        return deque.peek();
    }
}