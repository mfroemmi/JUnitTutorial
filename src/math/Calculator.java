package math;

public class Calculator {
    public long nfac(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Can't compute factorial of number < 0");
        }
        long result = 1;
        for (int i = 2; i <= n; ++i) {
            result *= i;
        }
        return result;
    }
}
