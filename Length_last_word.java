class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0; // Initialize the length of the last word
        int i = s.length() - 1; // Start from the last character

        // Skip any trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
