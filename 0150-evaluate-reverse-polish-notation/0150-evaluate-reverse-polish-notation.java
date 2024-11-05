class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> stack = new Stack<>();

        for (String i : tokens) {
            if (i.equals("+")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String c = String.valueOf(b + a);
                stack.push(c);
            }
            else if (i.equals("-")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String c = String.valueOf(b - a);
                stack.push(c);
            }
            else if (i.equals("*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String c = String.valueOf(b * a);
                stack.push(c);
            }
            else if (i.equals("/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                String c = String.valueOf(b / a);
                stack.push(c);
            }
            else {
                stack.push(i);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}