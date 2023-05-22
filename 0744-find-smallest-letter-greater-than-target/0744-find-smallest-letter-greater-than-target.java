class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int mid = l + (r-l) / 2;
            if (letters[mid] > target) {
                r = mid - 1;
            }
            else if (letters[mid] < target) {
                l = mid + 1;
            }
            else {
                l = mid + 1;
            }
        }
        if (l > letters.length - 1) {
            return letters[0];
        }
        return letters[l];
    }
}