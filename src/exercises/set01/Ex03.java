import common.IrsUtil;

void main() {
    String response = IO.readln("Simulação IRS\nSalário anual? ");
    int wage = Integer.parseInt(response);
    int irsGroup = IrsUtil.irsGroup(wage);
    double tax = IrsUtil.irsTax(irsGroup);
    IO.println("Escalão: " + irsGroup);
    IO.println("Taxa: " + tax * 100 + "%");
}