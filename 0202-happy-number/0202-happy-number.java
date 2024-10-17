class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> hashset = new HashSet<>();
        
        while (n != 1 && !hashset.contains(n)) {
            hashset.add(n);
            n = getNextNumber(n);
        }
        
        return n == 1;
    }
    public int getNextNumber(int n) {
        int result = 0;
        while (n > 0) {
            int temp = n % 10;
            result += temp * temp;
            n = n / 10;
        }
        return result;
    }
}