class Solution {
    public int strStr(String haystack, String needle) {
        
        int[] lps = lps2(needle);
        int i = 0;
        int j = 0;
        
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            else if (j == 0) {
                i++;
            }
            else {
                j = lps[j - 1];
            }
            if (j == needle.length()) {
                return i - needle.length();
            }
        }
        return -1;

    }
    public int[] lps(String s) {

        int[] next = new int[s.length()];
        int prev_len = 0;
        int i = 1;

        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(prev_len)) {
                prev_len++;
                next[i] = prev_len;
                i++;
            }
            else if (prev_len == 0) {
                next[i] = 0;
                i++;
            }
            else {
                prev_len = next[prev_len - 1];
            }
        }
        return next;
    }

    public int[] lps2(String s) {
        int[] next = new int[s.length()];
        int prev_len = 0;
        int i = 1;
        while (i < next.length) {
            while (prev_len > 0 && s.charAt(i) != s.charAt(prev_len)) {
                prev_len = next[prev_len - 1];
            }
            if (s.charAt(i) == s.charAt(prev_len)) {
                prev_len++;
            }
            next[i] = prev_len;
            i++;
        }
        return next;
    }
}