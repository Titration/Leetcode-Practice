class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for (String i : tokens) {
            if (i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                
                if (i.equals("+")) {
                    stack.push(b + a);
                }
                else if (i.equals("-")) {
                    stack.push(b - a);
                }
                else if (i.equals("*")) {
                    stack.push(b * a);
                }
                else if (i.equals("/")) {
                    stack.push(b / a);
                }
            }
            else {
                stack.push(Integer.valueOf(i));
            }
        }
        int res = stack.pop();
        return res;
    }
}