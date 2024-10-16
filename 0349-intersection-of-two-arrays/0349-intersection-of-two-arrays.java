class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        //since the constrains given the length of nums1 & nums2
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];
        List<Integer> list = new ArrayList<>();
        
        for (int i : nums1) {
            arr1[i]++;
        }
        for (int i : nums2) {
            arr2[i]++;
        }
        for (int i = 0; i < 1001; i++) {
            if (arr1[i] > 0 && arr2[i] > 0) {
                list.add(i); // I was wrong because this: list.add(arr1[i]);
            }
        }
        
        int index = 0;
        int[] result = new int[list.size()];
        for (int i : list) {
            result[index++] = i;
        }
        
        return result;
    }
}