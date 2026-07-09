class Solution {
    public String minWindow(String s, String t) {
         HashMap<Character, Integer> target = new HashMap<Character, Integer>();

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (target.containsKey(ch)) {
                target.put(ch, target.get(ch) + 1);
            } else {
                target.put(ch, 1);
            }
        }

        // Store frequency of current window
        HashMap<Character, Integer> window = new HashMap<Character, Integer>();

        int left = 0;
        int matched = 0;

        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;

        // Expand the window
        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            // Add current character into window map
            if (window.containsKey(rightChar)) {
                window.put(rightChar, window.get(rightChar) + 1);
            } else {
                window.put(rightChar, 1);
            }

            // Check whether current character reached required frequency
            if (target.containsKey(rightChar)) {

                if (window.get(rightChar).intValue() == target.get(rightChar).intValue()) {
                    matched++;
                }
            }

            // Shrink the window until it becomes invalid
            while (matched == target.size()) {

                // Update minimum answer
                int currentLength = right - left + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);

                // Remove left character from window
                window.put(leftChar, window.get(leftChar) - 1);

                // If removing breaks the required frequency,
                // window becomes invalid
                if (target.containsKey(leftChar)) {

                    if (window.get(leftChar) < target.get(leftChar)) {
                        matched--;
                    }
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLength);

    }
}