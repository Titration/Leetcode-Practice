class Solution {
    public String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder();
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (top >= 0 && sb.charAt(top) == item) {
                sb.deleteCharAt(top);
                top--;
            }
            else {
                sb.append(item);
                top++;
            }
        }

        return sb.toString();
    }
}