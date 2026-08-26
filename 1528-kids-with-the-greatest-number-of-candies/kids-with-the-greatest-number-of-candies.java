class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int x : candies) {
            max = Math.max(max, x);
        }
        List<Boolean> ans = new ArrayList<>();
        for (int x : candies) {
            ans.add(x + extraCandies >= max);
        }
        return ans;
    }
}