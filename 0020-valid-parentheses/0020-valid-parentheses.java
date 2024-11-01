class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) { return false; }
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (stack.isEmpty()) {
                return false;
            }
            else if (c != stack.peek()) {
                return false;
            }
            else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}