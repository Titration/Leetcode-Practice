class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == item) {
                stack.pop();
            }
            else {
                stack.push(item);
            }
        }

        char[] array = new char[stack.size()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = stack.pop();
        }
        
        return String.valueOf(array);
    }
}