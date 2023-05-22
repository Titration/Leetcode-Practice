class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // binary search
        int l = 0, r = letters.length - 1;
        
        if (target >= letters[r]) {
            return letters[0];
        }
        
        while (l <= r) {
            int mid = l + (r-l) / 2;
            if (letters[mid] > target) {
                r = mid - 1;
            }
            else if (letters[mid] <= target) {
                l = mid + 1;
            }
        }
        return letters[l];
    }
}