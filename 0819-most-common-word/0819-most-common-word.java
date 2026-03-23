class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String t = paragraph.toLowerCase();
        String f = "";

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || ch == ' ') {
                f = f + ch;
            }else{
                f=f+' ';
            }
        }

        String[] arr = f.split(" ");
        String[] k = new String[arr.length];
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) continue;

            int count = 0;
            for (int j = 0; j < banned.length; j++) {
                if (arr[i].equals(banned[j])) {
                    count++;
                }
            }

            if (count == 0) {
                k[l++] = arr[i];
            }
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < l; i++) {
            if (map.containsKey(k[i])) {
                map.put(k[i], map.get(k[i]) + 1);
            } else {
                map.put(k[i], 1);
            }
        }

        int max = 0;
        String res = "";

        // find max
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                res = key;
            }
        }

        return res;
    }
}