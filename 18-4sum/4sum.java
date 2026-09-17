import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                HashSet<Long> map = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long need = (long) target - nums[i] - nums[j] - nums[k];                    if (map.contains(need)) {
                        List<Integer> temp = Arrays.asList(
                            nums[i], nums[j], (int) need, nums[k]
                        );
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    map.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}