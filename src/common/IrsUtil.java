package common;

public class IrsUtil {
    public static int irsGroup(int a) {
        if (a > 48500) {
            return 4;
        }
        if (a > 25500) {
            return 3;
        }
        if (a >= 10000) {
            return 2;
        }
        return 1;
    }

    public static double irsTax(int a) {
        if (a == 1) {
            return 0.12;
        }
        if (a == 2) {
            return 0.18;
        }
        if (a == 3) {
            return 0.23;
        }
        if (a == 4) {
            return 0.29;
        }
        return 0.0;
    }
}
