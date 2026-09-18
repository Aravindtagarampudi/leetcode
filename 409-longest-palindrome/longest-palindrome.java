class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int length = 0;
        boolean odd = false;
        for (int i = 0; i < 128; i++) {
            length += (count[i] / 2) * 2;
            if (count[i] % 2 == 1) {
                odd = true;
            }
        }
        if (odd) {
            length++;
        }
        return length;
    }
}