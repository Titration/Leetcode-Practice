class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int res = 0;
        int left = 0;
        Set<Character> hashset = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (hashset.contains(s.charAt(right))) {
                hashset.remove(s.charAt(left));
                left++;
            }
            hashset.add(s.charAt(right));
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}