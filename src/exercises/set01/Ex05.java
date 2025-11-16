void main() {
    String response = "";
    double sum = 0.0;
    int count = 0;
    while (true) {
        response = IO.readln();
        if (response.equals("0")) break;

        double num = Double.parseDouble(response);
        sum += num;
        count++;
    }
    IO.println("total: " + count);
    IO.println("média: " + sum / count);
}