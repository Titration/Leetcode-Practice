class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (stack1.size() != 0) {
                    stack1.pop();
                }
            }
            else {
                stack1.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (stack2.size() != 0) {
                    stack2.pop();
                }
            }
            else {
                stack2.push(t.charAt(i));
            }
        }

        while (stack1.size() != 0 && stack2.size() != 0) {
            if (stack1.peek() == stack2.peek()) {
                stack1.pop();
                stack2.pop();
            }
            else {
                return false;
            }
        }
        return (stack1.size() == stack2.size()) ? true : false;
    }
}