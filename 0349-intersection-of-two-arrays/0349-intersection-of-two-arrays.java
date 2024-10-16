class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> hashset = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            hashset.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashset.contains(nums2[i]) && !list.contains(nums2[i])) {
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}