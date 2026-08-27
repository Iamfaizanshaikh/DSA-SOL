class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int n = s.length();

        for (int i = 0; i < n; i++) {
            int cur = target.charAt(i) - 'a';

            if (freq[cur] == 0) {
                for (int j = cur + 1; j < 26; j++) {
                    if (freq[j] > 0) {
                        return build(target, i, j, freq);
                    }
                }

                for (int p = i - 1; p >= 0; p--) {
                    freq[target.charAt(p) - 'a']++;

                    int x = target.charAt(p) - 'a';

                    for (int j = x + 1; j < 26; j++) {
                        if (freq[j] > 0) {
                            return build(target, p, j, freq);
                        }
                    }
                }

                return "";
            }

            freq[cur]--;
        }

        for (int i = n - 1; i >= 0; i--) {
            freq[target.charAt(i) - 'a']++;

            int cur = target.charAt(i) - 'a';

            for (int j = cur + 1; j < 26; j++) {
                if (freq[j] > 0) {
                    return build(target, i, j, freq);
                }
            }
        }

        return "";
    }

    private String build(String target, int pos, int bigger, int[] freq) {
        int[] temp = freq.clone();
        temp[bigger]--;

        StringBuilder ans = new StringBuilder(target.substring(0, pos));
        ans.append((char) ('a' + bigger));

        for (int i = 0; i < 26; i++) {
            while (temp[i] > 0) {
                ans.append((char) ('a' + i));
                temp[i]--;
            }
        }

        return ans.toString();
    }
}