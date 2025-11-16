void main() {
    for (int i = 0; i < 10; i++) {
        IO.println("Cara ou coroa? " + ((int) (Math.random() * 10) % 2 == 0 ? "cara!" : "coroa!"));
    }
}