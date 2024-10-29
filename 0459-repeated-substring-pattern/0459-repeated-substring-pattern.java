class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.isEmpty()) {
            return false;
         }
        
        int[] next = lps(s);
        int len = s.length();
        int max_lps = next[next.length - 1]; // the last item in NEXT is the max lps for String s
        if (max_lps > 0 && len % (len - max_lps) == 0) {
            return true;
        }
        return false;
    }

    public int[] lps(String s) {
        int[] next = new int[s.length()];
        int j = 0;
        int i = 1;
        while (i < next.length) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                next[i] = j;
                i++;
            }
            else if (j == 0) {
                next[i] = j;
                i++;
            }
            else {
                j = next[j - 1];
            }
        }
        return next;
    }
}