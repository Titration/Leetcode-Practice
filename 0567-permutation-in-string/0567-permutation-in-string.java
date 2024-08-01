class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> s1_map = new HashMap<>();

        for (char letter : s1.toCharArray()) {
            s1_map.put(letter, s1_map.getOrDefault(letter, 0) + 1);
        }

        int left = 0, right = 0, count = 0, minLength = Integer.MAX_VALUE;
        while (right < s2.length()) {
            char right_letter = s2.charAt(right);
            if (s1_map.containsKey(right_letter)) {                
                window.put(right_letter, window.getOrDefault(right_letter, 0) + 1);
                if (window.get(right_letter) <= s1_map.get(right_letter)) {
                    count++;
                }
            }
            while (count == s1.length()) {
                if (minLength > right - left + 1) {
                    minLength = right - left + 1;
                    if (minLength == s1.length()) {
                        return true;
                    }
                }
                char left_letter = s2.charAt(left);
                if (window.containsKey(left_letter)) {
                    window.put(left_letter, window.getOrDefault(left_letter, 0) - 1);
                    if (window.get(left_letter) < s1_map.get(left_letter)) {
                        count--;
                    }
                }
                left++;
            }
            right++;
        }
        return false;
    }
}