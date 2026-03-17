import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {

            int maxFreq = -1;
            int maxKey = -1;

            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }

            res[i] = maxKey;
            map.put(maxKey, -1);
        }

        return res;
    }
}