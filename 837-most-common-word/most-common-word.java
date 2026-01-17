import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        for (String w : words) {
            if (!ban.contains(w)) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        String ans = "";
        int max = 0;
        for (String w : map.keySet()) {
            if (map.get(w) > max) {
                max = map.get(w);
                ans = w;
            }
        }
        return ans;
    }
}
