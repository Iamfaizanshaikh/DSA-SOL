class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        boolean negative = false;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                negative = true;
            }
            i++;
        }

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                break;
            }
            sb.append(ch);
            i++;
        }
        if (sb.length() == 0) {
            return 0;
        }

        int num = 0;
        for (int j = 0; j < sb.length(); j++) {

            int digit = sb.charAt(j) - '0';

            if (num > Integer.MAX_VALUE / 10 ||(num == Integer.MAX_VALUE / 10 && digit > 7)) {

                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            num = num * 10 + digit;
        }

        return  negative?-num:num;

    }
}