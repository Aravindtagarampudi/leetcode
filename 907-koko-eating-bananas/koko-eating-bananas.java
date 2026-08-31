class Solution {
    public int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        for (; low <= high;) {
            int mid = low + (high - low) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + (long) mid - 1) / mid;
            }
            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}