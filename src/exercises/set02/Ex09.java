void main() {
    String[] words = {"quatro", "zero", "um"};
    IO.println(longestWord(words));
}

String longestWord(String[] words) {
    String longest = words[0];
    for (int i = 1; i < words.length; i++) {
        if (words[i].length() > longest.length()) {
            longest = words[i];
        }
    }
    return longest;
}