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

        int left = 0, count = 0, minLeft = 0, minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char right_letter = s.charAt(right);
            if (t_map.containsKey(right_letter)) {
                window.put(right_letter, window.getOrDefault(right_letter, 0) + 1);
                if (window.get(right_letter) <= t_map.get(right_letter)) {
                    count++;
                }
            }
            while (count == t.length()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }
                // shrink window
                char left_letter = s.charAt(left++);
                if (window.containsKey(left_letter)) {
                    window.put(left_letter, window.getOrDefault(left_letter, 0) - 1);
                    if (window.get(left_letter) < t_map.get(left_letter)) {
                        count--;
                    }
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}