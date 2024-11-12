class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);

        int ptr_first_letter = 0;
        int ptr_last_letter = 0;
        String first_letter = strs[0];
        String last_letter = strs[strs.length - 1];
        StringBuilder result = new StringBuilder();

        while (ptr_first_letter < first_letter.length() && ptr_last_letter < last_letter.length()) {
            if (first_letter.charAt(ptr_first_letter) != last_letter.charAt(ptr_last_letter)) {
                return result.toString();
            }
            result.append(first_letter.charAt(ptr_first_letter));
            ptr_first_letter++;
            ptr_last_letter++;
        }
        return first_letter;
    }
}