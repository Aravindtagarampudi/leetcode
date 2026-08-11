class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (char ch : p.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        char[] arr = s.toCharArray();

        for (int right = 0; right < arr.length; right++) {
            char ch = arr[right];
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            if (right - left + 1 > p.length()) {
                char remove = arr[left];
                mp.put(remove, mp.get(remove) - 1);

                if (mp.get(remove) == 0) {
                    mp.remove(remove);
                }

                left++;
            }

            if (hm.equals(mp)) {
                list.add(left);
            }
        }

        return list;
    }
}