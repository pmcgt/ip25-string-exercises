import common.IrsUtil;

void main() {
    String firstResponse = IO.readln("Tabela de escalões IRS\nPrimerio escalão: ");
    int firstTaxGroup = Integer.parseInt(firstResponse);
    String secondResponse = IO.readln("Último escalão: ");
    int lastTaxGroup = Integer.parseInt(secondResponse);

    for (int i = firstTaxGroup; i <= lastTaxGroup; i++) {
        IO.println(i == firstTaxGroup ? "" : "---------");
        IO.println(i + " | " + IrsUtil.irsTax(i) * 100 + "%");
    }
}