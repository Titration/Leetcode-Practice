class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int[] hashmap = new int[2001]; // Constraints: -1000 <= arr[i] <= 1000
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] + 1000; // convert to positive number, prevent negative index
            hashmap[index]++;
        }

        int[] occurrence = new int[1001]; // Constraints: 1 <= arr.length <= 1000, means the max occurrence is 1000

        for (int i = 0; i < hashmap.length; i++) {
            int value = hashmap[i];
            if (value > 0 && occurrence[value] > 0) {
                return false;
            }
            occurrence[value]++; 
        }
        return true;
    }
}