class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> losses = new HashMap<>();
        for (int[] m : matches) {
            int winner = m[0];
            int loser = m[1];
            losses.put(winner, losses.getOrDefault(winner, 0));
            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for (int player : losses.keySet()) {
            if (losses.get(player) == 0) {
                zero.add(player);
            } else if (losses.get(player) == 1) {
                one.add(player);
            }
        }
        Collections.sort(zero);
        Collections.sort(one);
        return Arrays.asList(zero, one);
    }
}