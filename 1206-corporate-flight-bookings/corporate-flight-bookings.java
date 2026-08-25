class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] flights = new int[n]; 
        for (int[] booking : bookings) {
            int l = booking[0];
            int r = booking[1];
            int val = booking[2];
            for (int i = l - 1; i < r; i++) {
                flights[i] += val;
            }
        }
        return flights;
    }
}
