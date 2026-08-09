class Solution {
    public long maxPairStrength(int[] nums) {
        long ans  = 0;
        for (int i=0;i < nums.length-1;i++){
            for(int j=0;j<nums.length;j++){
                long g = gcd(nums[i],nums[j]);
                long strength = (1L *nums[i] * nums[j]) / (g * g);
                ans = Math.max(ans,strength);
            }
        }
        return ans;
    }
    private long gcd(long a,long b){
        while (b != 0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
