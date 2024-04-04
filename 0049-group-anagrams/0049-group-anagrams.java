class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String sorted_word = new String(word);
            // or 
            // String sorted_word = String.valueOf(word);

            if (!map.containsKey(sorted_word)) {
                map.put(sorted_word, new ArrayList<>());
            }
            map.get(sorted_word).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}