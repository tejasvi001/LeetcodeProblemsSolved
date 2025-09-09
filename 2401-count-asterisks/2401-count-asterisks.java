class Solution {
    public static int countAsterisks(String s) {
        int count = 0;
        boolean pair = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '|') {
                pair = !pair;
            }

            if (pair == false && ch == '*') {
                count++;
            }
        }
        return count;
    }
}