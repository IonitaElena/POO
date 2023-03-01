public class Prob7 {
    public static void main(String args[]) {
        int nrpar = 20;
        for (int i = 1; i < nrpar/2; i++) {
            int j = nrpar - i;
            if (verificare(i) && verificare(j)) {
                System.out.println(nrpar + " = " + i + " + " + j);
            }
        }
    }
    public static boolean verificare(int n) {
        boolean contor = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                contor = false;
                break;
            }
        }
        return contor;
    }
}