class Solution {
    public boolean canJump(int[] nums) {
        int fas = 0;
        for(int i=0;i<nums.length;i++){
            if (i>fas){
                return false;
            }
            fas = Math.max(fas,i+nums[i]);
        }
        return true;
    }
}