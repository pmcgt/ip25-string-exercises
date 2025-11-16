void main() {
    IO.println(isInt("123"));
    IO.println(isInt("a22"));
}

boolean isInt(String s) {
    for (int i = 0; i < s.length(); i++) {
        if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
            return false;
        }
    }
    return true;
}