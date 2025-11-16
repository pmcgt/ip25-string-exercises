void main() {
    IO.println(countLines(""));
    IO.println(countLines("uma frase"));
    IO.println(countLines("um,\ne dois\n três"));
}

int countLines(String s) {
    if (s.isEmpty()) {
        return 0;
    }
    
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '\n') {
            count++;
        }
    }
    return count;
}