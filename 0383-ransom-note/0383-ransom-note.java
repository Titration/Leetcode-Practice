class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] hashmap = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            int key = magazine.charAt(i) - 'a';
            hashmap[key]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int key = ransomNote.charAt(i) - 'a';
            if (hashmap[key] == 0) {
                return false;
            }
            hashmap[key]--;
        }
        return true;
    }
}