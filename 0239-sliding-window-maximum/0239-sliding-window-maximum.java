class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Myqueue queue = new Myqueue();
        int[] result = new int[nums.length - k + 1];
        int index = 0;

        for (int i = 0; i < k; i++) {
            queue.push(nums[i]);
        }
        result[index++] = queue.getMaxValue(); 
        for (int i = k; i < nums.length; i++) {
            queue.pop(nums[i - k]);
            queue.push(nums[i]);
            result[index++] = queue.getMaxValue();
        }
        return result;
    }
}

class Myqueue {
    Deque<Integer> deque;

    public Myqueue() {
        deque = new LinkedList<>();
    }
    
    public void pop(int value) {
        if (!deque.isEmpty() && deque.peek() == value) {
            deque.pop();
        }
    }

    public void push(int value) {
        while (!deque.isEmpty() && deque.peekLast() < value) {
            deque.removeLast();
        }
        deque.add(value);
    }

    public int getMaxValue() {
        return deque.peek();
    }
}