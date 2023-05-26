class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        int l, r;
        boolean isExist = false;

        for(int i = 0; i < arr.length; i++) {
            l = 0; 
            r = arr.length - 1;
            
            int target = arr[i]*2;
            while (l <= r) {
                int mid = l + (r-l)/2;
                if (arr[mid] == target && mid != i) {
                    return true;
                }
                else if (arr[mid] > target) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return isExist;
    }
}