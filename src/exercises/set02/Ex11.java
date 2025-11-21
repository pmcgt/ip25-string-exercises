void main() {
    int[] array = {1, 2, 3};
    IO.println(toText(array, " "));
    IO.println(toText(array, ", "));
}

String toText(int[] array, String operator) {
    String newStr = Integer.toString(array[0]);
    for (int i = 1; i < array.length; i++) {
        newStr += operator + array[i];
    }
    return newStr;
}