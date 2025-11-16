void main() {
    String response = IO.readln("total? ");
    int max = Integer.parseInt(response);

    for (int i = 1; i <= max; i++) {
        IO.println(i);
    }
}