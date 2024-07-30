class Solution {
    public String minWindow(String s, String t) {
        
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();
        for (char letter : t.toCharArray()) {
            t_map.put(letter, t_map.getOrDefault(letter, 0) + 1);
        } 

        int left = 0, right = 0;
        int count = 0;
        int minLeft = 0;
        int minLength = Integer.MAX_VALUE;
        

        while (right < s.length()) {
            char right_letter = s.charAt(right);
            if (t_map.containsKey(right_letter)) {
                window.put(right_letter, window.getOrDefault(right_letter, 0) + 1);
                if (window.get(right_letter) <= t_map.get(right_letter)) {
                    count++;
                }
            }
            while (count == t.length()) {
                if (minLength > right - left + 1) {
                    minLength = right - left + 1;
                    minLeft = left;
                }
                //shrink the window by moving the left pointer
                char left_letter = s.charAt(left);
                if (window.containsKey(left_letter)) {
                    window.put(left_letter, window.get(left_letter) - 1);
                    if (window.get(left_letter) < t_map.get(left_letter)) {
                        count--;
                    }
                }
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);

    }
}