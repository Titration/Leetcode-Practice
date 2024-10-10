class Solution {
    public String reverseStr(String s, int k) {
        
        char[] result = s.toCharArray();

        // 1. 每隔 2k 个字符的前 k 个字符进行反转
        for (int i = 0; i < result.length; i+=2*k) {
            // 2. 剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符
            if (i+k <= result.length) {
                reverse(result, i, i+k);
                continue;
            }
            // 3。 剩余字符少于 k 个，则将剩余字符全部反转
            reverse(result, i, result.length);
        }
        return new String(result);
    }
    public void reverse(char[] arr, int start, int end) {
        int l = start;
        int r = end - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}