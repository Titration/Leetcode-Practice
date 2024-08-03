class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> s1_map = new HashMap<>();
        HashMap<Character, Integer> window_map = new HashMap<>();
        
        for (char letter : s1.toCharArray()) {
            s1_map.put(letter, s1_map.getOrDefault(letter, 0) + 1);
        }
        
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            for (int j = i; j < i + s1.length(); j++) {
                char right_letter = s2.charAt(j);
                if (s1_map.containsKey(right_letter)) {
                    window_map.put(right_letter, window_map.getOrDefault(right_letter, 0) + 1);
                }
            }
            if (window_map.equals(s1_map)) {
                return true;
            }
            else {
                window_map.clear();
            }
        }
        return false;
    }
}