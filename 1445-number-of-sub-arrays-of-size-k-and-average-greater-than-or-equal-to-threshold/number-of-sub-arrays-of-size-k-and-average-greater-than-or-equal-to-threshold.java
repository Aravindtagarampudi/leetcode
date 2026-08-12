class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        double currentSum = 0;
        int count = 0;
        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];
            if (right >= k - 1) {
                double avg = currentSum / k;
                if (avg >= threshold) {
                    count++;
                }
                currentSum -= arr[left];
                left++;
            }
        }
        return count;
    }
}