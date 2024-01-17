public class BinomialCoeff {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f; // factorial of n
    }

    public static int binCoef(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoef = fact_n / (fact_r * fact_nmr);
        return binCoef;

    }

    public static void main(String[] args) {
     System.out.println(binCoef(5, 2));
}
}
