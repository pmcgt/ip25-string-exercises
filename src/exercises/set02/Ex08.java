void main() {
    String[] words = {"um", "zero", "um"};
    IO.println(countWord(words, "um"));
    IO.println(countWord(words, "dois"));
}

int countWord(String[] words, String find) {
    int count = 0;
    for (int i = 0; i < words.length; i++) {
        if (words[i].equals(find)) {
            count++;
        }
    }
    return count;
}