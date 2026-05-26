class Solution {
    public int numberOfSpecialChars(String word) {
        int specialChars = 0;

        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> lower = new HashSet<>();

        for (char c : word.toCharArray()) {

            if (Character.isUpperCase(c)) {
                upper.add(c);
            } else {
                lower.add(c);
            }
        }

        for (Character c : upper) {
            if (lower.contains(Character.toLowerCase(c))) {
                specialChars++;
            }
        }

        return specialChars;
    }
}