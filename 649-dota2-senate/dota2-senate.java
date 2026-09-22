class Solution {
    public String predictPartyVictory(String senate) {
        ArrayDeque<Integer> radiant = new ArrayDeque<>();
        ArrayDeque<Integer> dire = new ArrayDeque<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
             if (senate.charAt(i) == 'R') {
               radiant.offer(i);
            } else {
              dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d) {
               radiant.offer(r + n);
            } else {
               dire.offer(d + n);
            }
        }
        if(radiant.isEmpty()){
            return "Dire";
        }
        else{
            return"Radiant";
        }
    }
}