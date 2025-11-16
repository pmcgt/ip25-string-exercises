void main() {
    IO.println(toInt("2025"));
    IO.println(toInt("a1"));
}

boolean isInt(String s) {
    for (int i = 0; i < s.length(); i++) {
        if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
            return false;
        }
    }
    return true;
}

int toInt(String s) {
    assert isInt(s);

    int accumulator = 0;
    for (int i = 0; i < s.length(); i++) {
        int currentNumber = s.charAt(i) - 48;
        accumulator = (accumulator * 10) + currentNumber;
    }
    return accumulator;
}