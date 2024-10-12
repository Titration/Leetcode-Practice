class Solution {
    public String reverseWords(String s) {
        
        char[] array = s.toCharArray();
        // remove the extra black space
        int slow = 0;
        for (int fast = 0; fast < array.length; fast++) {
            if (array[fast] != ' ') {
                if (slow != 0) {
                    array[slow++] = ' ';
                }
                while (fast < array.length && array[fast] != ' ') {
                    array[slow++] = array[fast++];
                }
            }
        }
        // reverse
        int l = 0;
        int r = slow; // new length
        reverse(array, l, r);
        for (int i = 0; i < r; i++) {
            if (array[i] == ' ') {
                reverse(array, l, i);
                l = i + 1;
            }
        }
        reverse(array, l, r);

        return new String(array, 0, r);
    }
    public void reverse(char[] array, int start, int end) {
        int l = start;
        int r = end - 1;
        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }
    }
}