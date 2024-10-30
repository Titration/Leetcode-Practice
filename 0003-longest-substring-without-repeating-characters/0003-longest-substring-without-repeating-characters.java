class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int res = 0;
        int left = 0;
        int right = 0;
        Set<Character> hashset = new HashSet<>();

        while (right < s.length()) {
            while (hashset.contains(s.charAt(right))) {
                hashset.remove(s.charAt(left));
                left++;
            }
            hashset.add(s.charAt(right));
            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}